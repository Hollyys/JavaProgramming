package Chapter06;

public class CircleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++) {
			c[i] = new Circle(i+1); // 배열 원소마다 객체생성 
			System.out.print((int)(c[i].getArea()) + " ");
		}

	}

}
