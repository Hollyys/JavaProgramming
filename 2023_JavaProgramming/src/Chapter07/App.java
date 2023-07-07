package Chapter07;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airline airline = new Airline(5);
		
		Scanner scanner = new Scanner(System.in);
		try {
			int input = scanner.nextInt();
			
			if(input == 1)
				airline.print();
			else
				System.out.println("뒤질래?");
		}
		catch(InputMismatchException e) {
			System.out.println("뒤질래?");
		}
		scanner.close();
		
	}

}
