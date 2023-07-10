package Chapter15;

import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 크기 (capacity)가 10인 디폴트 벡터 생성
		Vector<Integer> vector = new Vector<Integer>();
		System.out.printf("1.size: %2d, Capacity: %2d\n", vector.size(), vector.capacity());
		
		// 벡터에 요소 10개 추가
		int i;
		for(i=0; i < 10; i++) {
		    vector.add(i+1);
		}
		System.out.printf("2.size: %2d, Capacity: %2d\n", vector.size(), vector.capacity());
		
		/* 초기벡터크기보다1개더추가
		 * (크기가 부족한 경우, 2배씩 증가)
		*/
		vector.add(i+1);
		System.out.printf("3.size: %2d, Capacity: %2d\n", vector.size(), vector.capacity());
		System.out.println();
		
		for(Integer n : vector) {
			System.out.print(n + " ");
		}
		System.out.println("\n");
		
		// 벡터에 요소 10개 더 추가
		// capacity는 두배인 40으로 증가
		for(; i < 20; i++) {
		    vector.add(i+1);
		}
		System.out.printf("4.size: %2d, Capacity: %2d\n", vector.size(), vector.capacity());
		System.out.println();
		
		for(Integer n : vector) {
			System.out.print(n + " ");
		}
		System.out.println("\n");

	}

}
