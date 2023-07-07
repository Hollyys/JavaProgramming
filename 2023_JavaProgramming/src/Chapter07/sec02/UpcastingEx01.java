package Chapter07.sec02;

class Parent {
	String name;
	String id;
	public void method1() {
		System.out.println("Parent=method1()");
	}
	
	public void method2() {
		System.out.println("Parent-method2()");
	}
}


class Child extends Parent{
	String job;
	int age;
	
	public Child(String job, int age) {
		this.age = age;
		this.job = job;
	}
	
	@Override
	public void method2() {
		System.out.println("Child-method2()");
	}
	public void method3() {
		System.out.println("Child-method3()");
	}

}

public class UpcastingEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child("Engineer", 25);
		
		Parent parent = child;
		
		//parent.job = "PM"; // 접근 못 함
		parent.method1();
		parent.method2();
		//parent.method3(); // 접근 못 함

	}

}
