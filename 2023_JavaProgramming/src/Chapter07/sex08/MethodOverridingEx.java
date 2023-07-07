package Chapter07.sex08;

class Shape { // 부모 클래스
	public Shape() {}
	public void draw() {
		System.out.println("Shape draw");
	}
}

class Line extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Line draw");
	}
}

class Rect extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Rect draw");
	}
}

class Circle extends Shape {
	public void draw() { // 메소드 오버라이딩
		System.out.println("Circle draw");
	}
}

public class MethodOverridingEx {
	static void paint(Shape p) {
		if(p instanceof Shape)
			System.out.print("Shape object - ");
		if(p instanceof Line)
			System.out.print("Line object - ");
		if(p instanceof Rect)
			System.out.print("Rect object - ");
		if(p instanceof Circle)
			System.out.print("Circle object - ");
		p.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect()); 
		paint(new Circle());

	}

}
