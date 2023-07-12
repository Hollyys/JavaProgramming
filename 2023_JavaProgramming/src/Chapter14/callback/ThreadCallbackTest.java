package Chapter14.callback;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


class HttpGetThread extends Thread {
	String urlString;
	ThreadCallbackTest caller;
	
	public HttpGetThread(String url, ThreadCallbackTest obj) {
		this.urlString = url;
		this.caller = obj;
	}
	
	public void run() {
		String line = "";
		String info = "";
		String country = "";
		boolean countryFound = false;
		try {
			URL url = new URL(urlString);
			
			// URL에 연결 설정 
			HttpURLConnection httpConn = (HttpURLConnection)url.openConnection();
			httpConn.setRequestMethod("GET");
			int responseCode = httpConn.getResponseCode();
			
			if(responseCode == HttpURLConnection.HTTP_OK) {
				InputStreamReader inReader = 
						new InputStreamReader(httpConn.getInputStream(), "euc-kr");
				BufferedReader reader = new BufferedReader(inReader);
				
				while((line = reader.readLine()) != null) {					
					caller.updateProgress(line);				
					Thread.sleep(10);
				}
				
				// 해당 웹사이트의 데이터를 다 읽고 Done을 Caller에게 전달 
				caller.getThreadResult("Done");
				httpConn.disconnect();
				inReader.close();
				reader.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadCallbackTest {
	String url;
	HttpGetThread httpGetThread;
	
	public ThreadCallbackTest(String url) {
		this.url = url;
		// HttpGetThread  생성시 Caller의 객체 전달 
		httpGetThread = new HttpGetThread(url, this);
		httpGetThread.start();
	}
	
	public void updateProgress(String line) {
		System.out.println(line);
	}
	
	public void getThreadResult(String msg) {
		if(msg.equals("Done"))
			System.out.println("Http Connection Disconnected!");
	}
	
	public static void main(String[] args) {
		//String url = "https://finance.naver.com";
		String url = "https://finance.naver.com/marketindex/?tabSel=exchange#tab_section";
				
		ThreadCallbackTest obj = new ThreadCallbackTest(url);
	}
}
