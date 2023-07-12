package Chapter14;

public class ThreadMainEx {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		String name = thread.getName();  // 스레드의 이름 얻
		long id = thread.getId();	// getId(): deprecated(since="19") 스레드 ID 얻기 
		int priority = thread.getPriority(); 	// 스레드 우선순위 값 얻기 
		Thread.State state = thread.getState(); // 스레드의 상태 값 얻기 
		
		System.out.println("현재 스레드 이름: " + name);
		System.out.println("현재 스레드 ID: " + id);
		System.out.println("현재 스레드 우선순위 값: " + priority);
		System.out.println("현재 스레드 상태: " + state);
	}
}
