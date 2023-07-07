package Assignment01;
import java.util.Scanner;

// 2017110157 신성한
public class ChangeMoney {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int input;

		System.out.print("금약을 입력하세요>> ");
		input = scanner.nextInt();

		if(input <= 0) {
			System.out.println("0보다 큰 금액을 입력하세요");
			scanner.close();
			return;
		}
		else {
			int x, y;

			if(input >= 50000) {
				x = input/50000;
				System.out.println("오만원권 " + x + "매");
			}

			if(input >= 10000) {
				x = input/50000;
				input = input - 50000*x;
				y = input/10000;
				System.out.println("만원권 " + y + "매");
			}

			if(input >= 1000) {
				y = input/10000;
				input = input - 10000*y;
				x = input/1000;
				System.out.println("천원권 " + x + "매");
			}

			if(input >= 100) {
				x = input/1000;
				input = input - 1000*x;
				y = input/100;
				System.out.println("백원 " + y + "개");
			}

			if(input >= 10) {
				y = input/100;
				input = input - 100*y;
				x = input/10;
				System.out.println("십원 " + x + "개");
			}

			if(input >= 1) {
				x = input/10;
				input = input - 10*x;
				System.out.println("일원 " + input + "개");
			}
		}
		scanner.close();
	}

}
