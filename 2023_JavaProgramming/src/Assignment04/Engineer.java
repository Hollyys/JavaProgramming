package Assignment04;
// 2017110157 신성한
public class Engineer extends Employee {
	int annualSalary;
	int overWorkingday;
	
	public void setOverWorkingDay(int day) {
		//매달 초과 근무 일수 저장
		this.overWorkingday = day;
	}
	public int getOverworkingPay() {
		//초과 근무 비용 계산 (1일당 3만원)
		return overWorkingday*3;
	}
	public int getAnnualSalary() {
		this.annualSalary = (salary*12) + getOverworkingPay();
		return annualSalary;
	}
	
	@Override
	public void printEmployee() {
		//이름, 나이, 직위, 초과 근무 비용, 월급, 연봉 순서로 화면 출력
		super.printEmployee();
		System.out.printf("%17d%8d%15d\n",getOverworkingPay(), salary, getAnnualSalary());
	}

}
