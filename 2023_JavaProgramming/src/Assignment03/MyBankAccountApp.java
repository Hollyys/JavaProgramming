package Assignment03;
// 2017110157 신성한
import java.util.Scanner;

public class MyBankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		MyBankAccount ABCbank = new MyBankAccount("ABC bank", 10000, scanner); // 객체 생성: 객체 초기화
		MyBankAccount XYZbank = new MyBankAccount("XYZ bank", 10000, scanner); // 객체 생성: 객체 초기화

		while(true) {
			int input;
			System.out.println("[통합 은행계좌 관리 프로그램]");
			System.out.print("[메뉴를 선택하세요.(0: ABC bank, 1: XYZ bank, 2: 전체 계좌조회, 3: 종료) >> ");
			input = scanner.nextInt();
			System.out.println("---------------------------------------------------------------------------");

			if(input == 0) {
				// bank #1
				ABCbank.menu();

			}
			else if(input == 1) {
				// bank #2
				XYZbank.menu();

			}
			else if(input == 2) {
				// 전체 계좌조회
				int sum = ABCbank.initMoney + XYZbank.initMoney;
				System.out.println(ABCbank.bankName + "의 잔액: " + ABCbank.initMoney + "원");
				System.out.println(XYZbank.bankName + "의 잔액: " + XYZbank.initMoney + "원");
				System.out.println("전체 통장 잔액: " + sum + "원");
				System.out.println();

			}
			else if(input == 3) {
				// 종료
				scanner.close();
				System.out.println("통합 은행계좌 관리 프로그램을 종료합니다.");
				System.exit(0);
			}
			else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
				System.out.println("---------------------------------------------------------------------------");
			}
		}

	}

}
