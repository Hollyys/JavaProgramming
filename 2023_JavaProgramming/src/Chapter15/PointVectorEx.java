package Chapter15;

import java.util.Vector;

public class PointVectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Point 객체를 요소로 가지는 벡터 생성
		Vector<Point> v = new Vector<Point>();

		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));

		v.remove(1); // 인덱스 1의 Point(-5, 20) 객체 삭제

		for(int i=0; i<v.size(); i++) {
			Point p = v.get(i);
			System.out.println(p);
		}

	}

}
