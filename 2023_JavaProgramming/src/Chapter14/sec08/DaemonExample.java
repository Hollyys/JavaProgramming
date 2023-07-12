package  Chapter14.sec08;

public class DaemonExample {
	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		try {
			
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println("메인 스레드 종료");
		System.out.println("status: " + autoSaveThread.getState());
		System.out.println("status: " + Thread.currentThread().getState());
		System.out.println("isAlive: " + autoSaveThread.isAlive());
	}
}