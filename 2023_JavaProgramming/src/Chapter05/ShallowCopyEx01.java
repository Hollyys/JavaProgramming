package Chapter05;
import java.util.Arrays;

public class ShallowCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = new int[5];
		
		int myArray[] = intArray; // 얕은 복사
		
		for(int i=0; i<intArray.length; i++)
			intArray[i] = i;
		
		System.out.println("intArray[] 초기값 할당");
		System.out.println("-----------------------------");
		System.out.println("intArray[]: " + Arrays.toString(intArray));
		System.out.println("myArray[]: " + Arrays.toString(myArray));
		System.out.println("-----------------------------");
		
		// myArray[1]의 값 변경 -> intArray[1]도 같이 변경
		myArray[1] = myArray[1] + 10;
		System.out.println("myArray[1] 값 변경 이후 ");
		System.out.println("intArray[]: " + Arrays.toString(intArray));
		System.out.println("myArray[] : " + Arrays.toString(myArray));

	}

}
