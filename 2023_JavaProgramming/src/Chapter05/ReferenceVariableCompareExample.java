package Chapter05;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2); // 두 객체의 주소가 다름
		System.out.println(arr2 == arr3); // 두 객체의 주소가 같음
		
		System.out.printf("0x%x\n", System.identityHashCode(arr1));
		System.out.printf("0x%x\n", System.identityHashCode(arr2));
		System.out.printf("0x%x\n", System.identityHashCode(arr3));
	}

}
