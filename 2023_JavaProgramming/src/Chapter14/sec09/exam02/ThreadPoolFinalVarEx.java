package  Chapter14.sec09.exam02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolFinalVarEx {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		for(int i=0; i<100; i++) {
			/*
			 * Runnable 객체의 run()에서 count 값을 변경하지 못하도록 설정 
			 * - final int count = i;
			 */
			final int count = i; 
			executorService.execute(new Runnable() {
				public void run() {
					System.out.println("count: " + count);
					//System.out.println(count++);
				}
			});
		}
		executorService.shutdown();
	}
}
