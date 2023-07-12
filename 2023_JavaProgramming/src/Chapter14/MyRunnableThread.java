/**
 * Runnable 인터페이스를 사용한 Thread 생성 
 * 
 * @author changsu
 *
 */

package Chapter14;

class MyRunnable implements Runnable {
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.println(i + " Runnable");		
			try {
				Thread.sleep(1000);			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}	
}

public class MyRunnableThread {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
