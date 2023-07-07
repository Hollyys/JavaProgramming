package Chapter05;
import java.util.Arrays;

public class DeepCopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[] = {1,2,3,4,5};
		
		int myArray[] = Arrays.copyOf(intArray,  intArray.length);
		myArray[0] = 10;
		System.out.println(Arrays.toString(intArray));
		System.out.println(Arrays.toString(myArray));
		
		String[] oldStrArray = {"porsche","911","GT3"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);
		newStrArray[2] = "deepcopt";
		System.out.println(Arrays.toString(oldStrArray));
		System.out.println(Arrays.toString(newStrArray));

	}

}
