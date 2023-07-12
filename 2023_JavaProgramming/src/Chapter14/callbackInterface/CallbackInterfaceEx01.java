package Chapter14.callbackInterface;

import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class HttpGetThread extends Thread  {
	String urlString;
	HttpGetCallback callback;
	
	public HttpGetThread(String url) {
		this.urlString = url;
	}
	// Callback 함수 등록 메소드 
	public void setCallback(HttpGetCallback callback) {
		this.callback = callback;
	}
	
	public void run() {
		String line = "";
		try {
			URL url = new URL(urlString);
			HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
			httpConn.setRequestMethod("GET");
			int responseCode = httpConn.getResponseCode();
			
			if(responseCode == HttpURLConnection.HTTP_OK) {
				InputStreamReader inReader = new InputStreamReader(httpConn.getInputStream(), "UTF-8");
				BufferedReader reader = new BufferedReader(inReader);
				while((line = reader.readLine()) != null) {
					// 등록된 Callback 함수 호출 
					callback.updateProgress(line);
					Thread.sleep(10);
				}
				// 날짜 정보를 Caller에게 전달 
				DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String dateString = dateFormat.format(new Date());
				callback.updateDate(dateString);
				
				httpConn.disconnect();
				inReader.close();
				reader.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class CallbackInterfaceEx01 {
	String url;
	HttpGetThread httpGetThread;
	HttpGetCallback httpCallback;
	
	public CallbackInterfaceEx01(String url) {
		this.url = url;
		httpGetThread = new HttpGetThread(url);
		
		// Callback 인터페이스 구현 및 등록 방법 #1 
		httpCallback = new HttpGetCallback() {
			@Override
			public void updateProgress(String line) {
				System.out.println(line);
			}

			@Override
			public void updateDate(String date) {
				System.out.println("Latest update date: " + date);
			}
		};
		httpGetThread.setCallback(httpCallback);
		
		// Callback 인터페이스 구현 및 등록 방법 #2 
		
		httpGetThread.setCallback(new HttpGetCallback() {
			@Override
			public void updateProgress(String line) {
				System.out.println(line);
			}

			@Override
			public void updateDate(String date) {
				System.out.println("Latest update date: " + date);
			}
		});
		
		httpGetThread.start();
	}
	public static void main(String[] args) {
		String url = "https://www.naver.com";
		String url1 = "https://finance.daum.net/";
		
		CallbackInterfaceEx01 obj = new CallbackInterfaceEx01(url);
	}

}
