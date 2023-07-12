package Chapter14;

public class SimpleThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThread s[] = new SimpleThread[3];
		System.out.println("3개의 thread 생성 및 run() 호출\n");
		for(int i=0; i<s.length; i++) {
			s[i] = new SimpleThread();
			s[i].start(); // 3개의 thread 생성 및 run() 호출
		}
//		Current thread name: Thread-0  called run() method.
//		Current thread name: Thread-1  called run() method.
//		Current thread name: Thread-2  called run() method.
		
//		SimpleThread t[] = new SimpleThread[3];
//		System.out.println("main thread가 단순히 run() 호출\n");
//		for(int i=0; i<t.length; i++) {
//			t[i] = new SimpleThread();
//			t[i].run(); // main thread가 단순히 run() 호출
//		}
//		Current thread name: main  called run() method.
//		Current thread name: main  called run() method.
//		Current thread name: main  called run() method.
	}
}