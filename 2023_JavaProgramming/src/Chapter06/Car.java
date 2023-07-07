package Chapter06;

public class Car {
//	String company = "현대자동차";
//	String model = "그랜저";
//	String color = "폴라화이트";
//	int maxSpeed = 210;
//	int speed;
	
	String company = "기아";
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car() {
		this.model = "K5";
		this.color = "스노우 화이트 펄";
		this.maxSpeed = 320;
	}
	
	public Car(String model) {
		this(model, "은색", 230);
	}
}
