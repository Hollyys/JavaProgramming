package Chapter14;

class SharedBoard {
	private int sum = 0; // 집계판의 합
	synchronized public void add() {
		int n = sum;
		Thread.yield(); // 현재 실행중인 스레드 양보
		n+=10;
		sum=n; // 증가한 값을 집계합에 기록
		System.out.println(Thread.currentThread().getName() + ":" + sum);
	}

	public void addNoSync() {
		int n = sum;
		Thread.yield();
		n+=10;
		sum=n;
		System.out.println(Thread.currentThread().getName() + ":" + sum);
	}

	public int getSum() {return sum;}
}

class StudentThread extends Thread {
	private SharedBoard board;

	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}

	//	public void run() {
	//		System.out.println("With synchronize---" + Thread.currentThread().getName());
	//		for(int i=0; i<10; i++) {
	//			board.add();
	//		}

	//		With synchronize---student1
	//		With synchronize---student2
	//		student1:10
	//		student1:20
	//		student1:30
	//		student1:40
	//		student1:50
	//		student1:60
	//		student1:70
	//		student1:80
	//		student1:90
	//		student1:100
	//		student2:110
	//		student2:120
	//		student2:130
	//		student2:140
	//		student2:150
	//		student2:160
	//		student2:170
	//		student2:180
	//		student2:190
	//		student2:200

	public void run() {
		System.out.println("Without synchronize---" + Thread.currentThread().getName());
		for(int i=0; i<10; i++) {
			board.addNoSync();
		}

//		Without synchronize---student1
//		Without synchronize---student2
//		student2:10
//		student1:10
//		student2:20
//		student1:30
//		student2:40
//		student1:50
//		student2:60
//		student2:80
//		student1:70
//		student1:100
//		student1:110
//		student2:90
//		student1:120
//		student2:130
//		student1:140
//		student2:150
//		student1:160
//		student2:170
//		student1:180
//		student2:190

	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedBoard board = new SharedBoard();
		Thread s1 = new StudentThread("student1", board);
		Thread s2 = new StudentThread("student2", board);

		s1.start();
		s2.start();
	}
}
