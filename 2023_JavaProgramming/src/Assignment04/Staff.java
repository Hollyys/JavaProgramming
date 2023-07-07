package Assignment04;
// 2017110157 신성한

public class Staff extends Employee {
	int annualSalary;
	
	public int getAnnualSalary() {
		//연봉 계산 함수 (월급x12)
		this.annualSalary = salary*12;
		return annualSalary;
	}
	
	@Override
	public void printEmployee() {
		//이름, 나이, 직위, 월급, 연봉 순서로 화면 출력
		super.printEmployee();
		System.out.printf("%8d%14d\n", salary, getAnnualSalary());
	}

}
