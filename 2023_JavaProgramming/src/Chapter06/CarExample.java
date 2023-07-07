package Chapter06;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("그랜저", "아이스 화이트", 210); // 객체 생성: 객체 초기화
		
		myCar.company = "현대";
		System.out.println("재작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		// 객체의 필드값 변경 
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
		System.out.println();
		
		Car nosuCar;
		nosuCar = new Car();
		
		System.out.println("재작회사: " + nosuCar.company);
		System.out.println("모델명: " + nosuCar.model);
		System.out.println("색상: " + nosuCar.color);
		System.out.println("최고속도: " + nosuCar.maxSpeed);
		nosuCar.speed = 265;
		System.out.println("현재속도: " + nosuCar.speed);
		System.out.println();
		
		Car fatherCar = new Car("모하비");
		
		System.out.println("재작회사: " + fatherCar.company);
		System.out.println("모델명: " + fatherCar.model);
		System.out.println("색상: " + fatherCar.color);
		System.out.println("최고속도: " + fatherCar.maxSpeed);
		System.out.println("현재속도: " + fatherCar.speed);

	}

}
