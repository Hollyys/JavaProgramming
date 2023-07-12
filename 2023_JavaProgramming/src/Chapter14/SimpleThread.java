package Chapter14;

public class SimpleThread extends Thread {
	public void run() {
		System.out.print("Current thread name: " + Thread.currentThread().getName() + " ");
		System.out.println(" called run() method.");
	}

}
