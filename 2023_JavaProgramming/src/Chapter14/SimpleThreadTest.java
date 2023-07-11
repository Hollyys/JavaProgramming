package Chapter14;

public class SimpleThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleThread s[] = new SimpleThread[3];
		for(int i=0; i<s.length; i++) {
			s[i] = new SimpleThread();
			//s[i].run(); // main thread가 단순히 run() 호출
			s[i].start(); // 3개의 thread 생성 및 run() 호출
		}
	}
}