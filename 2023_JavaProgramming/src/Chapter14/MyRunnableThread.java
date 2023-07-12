/**
 * Runnable 인터페이스를 사용한 Thread 생성 
 * 
 * @author changsu
 *
 */

//	Java에서는 한 개의 class를 상속 한 경우
//	다른 class를 상속할 수 없기 때문에
//	thread를 이용하면서 다른 class를
//	상속해야 하는 경우 runnable interface을 구형하여
//	thread를 이용할 수 있다.

package Chapter14;

class MyRunnable implements Runnable {
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.print(i + " Runnable ");		
			try {
				Thread.sleep(1000);			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}	
}

public class MyRunnableThread {

	public static void main(String[] args) {
		Thread t = new Thread(new MyRunnable());
		t.start();
	}
}
