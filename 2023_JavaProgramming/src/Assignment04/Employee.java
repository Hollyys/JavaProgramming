package Assignment04;
// 2017110157 신성한

public class Employee {
	int age;
	String position;
	String name;
	int salary;
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setName(String firstname, String lastname) {
		//First name과 last name을 하나의 문자열 변수에 저장함
		this.name = firstname + " " + lastname;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void printEmployee() {
		//이름,나이,직위 순으로 모두 출력
		System.out.printf("%15s\t%4d%20s", name, age, position);
	}
	
	public String getName() {
		return name;
	}
	public int getSalary() {
		return salary;
	}
	public String getPosition() {
		return position;
	}
	public int getAge() {
		return age;
	}

}
