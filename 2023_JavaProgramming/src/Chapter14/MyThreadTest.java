/**
 * Thread 클래스 상속
 *
 */
package Chapter14;

class MyThread extends Thread {
	@Override
	public void run() {
		for(int i=10; i>=0; i--) {
			System.out.print(i + " ");		
			try {
				sleep(1000);			
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println();
	}	
}

public class MyThreadTest {
	public static void main(String[] args) {
		//Thread t = new MyThread();
		//t.start();
		MyThread t[] = new MyThread[3];
		for(int i=0; i<t.length; i++) {
			t[i] = new MyThread();
			t[i].run();
		}
	}
}
