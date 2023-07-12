package  Chapter14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExample {

	public static void main(String[] args) {
		//1000개의 메일 생성
		String[][] mails = new String[1000][3];
		for(int i=0; i<mails.length; i++) {
			mails[i][0] = "admin@my.com";		// from 
			mails[i][1] = "member"+i+"@my.com"; // to 
		   	mails[i][2] = "신상품 입고";		// content
		}
		
		//ExecutorService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		//이메일을 보내는 작업 생성 및 처리 요청
		for(int i=0; i<1000; i++) {
			final int idx = i;  // Runnable 객체의 run()에서 idx를 변경하는 것을 막음 
			System.out.println("final int idx: " + idx);
			
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					Thread thread = Thread.currentThread();
					String from = mails[idx][0];
					String to = mails[idx][1];
					String content = mails[idx][2];
					
					System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
				}
			});
		}
			
		//ExecutorService 종료
		executorService.shutdown();
	}
		
}