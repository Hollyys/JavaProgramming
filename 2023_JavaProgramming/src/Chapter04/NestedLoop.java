package Chapter04;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<10; i++) {
			for(int j=2; j<10; j++) {
				System.out.printf("%d x %d = %2d\t", i, j, i*j);
			}
			System.out.println("\n");
		}

	}

}
