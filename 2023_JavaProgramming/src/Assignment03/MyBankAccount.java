package Assignment03;
// 2017110157 신성한
import java.util.Scanner;

public class MyBankAccount {
	String bankName;
	Scanner scanner;
	int initMoney = 10000;

	public void deposit(int money) {
		// 정상적인 입금이 이루어진 경우,입금 후 통장의 잔고를 화면에 출력
		this.initMoney = this.initMoney + money;
		System.out.println(bankName + "의 잔액: " + this.initMoney + "원");
	}
	public void withdraw(int money) {
		// 출금할 금액이 통장 잔고보다 많은 경우, 에러메시지 출력
		// 정상 출금이 이루어진 경우,출금 후 통장의 잔고를 화면에 출력
		if(money > this.initMoney) {
			System.out.println("----------------------------------");
			System.out.println("잔액이 모자랍니다.");
			System.out.println("----------------------------------");
		}
		else
			this.initMoney = this.initMoney - money;
		System.out.println(bankName + "의 잔액: " + this.initMoney + "원");
	}
	public void showBalance() {
		// 잔액 조회 및 출력 함수
		System.out.println(bankName + "의 잔액: " + this.initMoney + "원");
	}
	public int readBalance() {
		// 잔액 읽기 함수
		return 0;
	}

	public void menu() {
		int input;
		while(true) {
			System.out.println(bankName + " 현금 입출금 프로그램");
			System.out.print("1.입금\n2.출금\n3.계좌조회\n4.종료\n>> ");

			input = scanner.nextInt();

			if(input == 1) {
				// 입금
				int deposit;
				System.out.print("입금금액: ");
				deposit = scanner.nextInt();

				if((deposit >= 10000) && (deposit%10000 == 0)) {
					this.deposit(deposit);
				}
				System.out.println("10000 원 단위의 금액을 입력하세요");
				System.out.println("----------------------------------");

			}
			else if(input == 2) {
				// 출금
				int withdraw;
				System.out.print("출금금액: ");
				withdraw = scanner.nextInt();

				if((withdraw <= this.initMoney) && (withdraw >= 10000) && (withdraw%10000 == 0)) {
					this.withdraw(withdraw);
				}
				else if(withdraw > this.initMoney) {
					System.out.println("----------------------------------");
					System.out.println("잔액이 모자랍니다.");
					System.out.println("----------------------------------");
				}
				else if(withdraw/1000 != 0) {
					System.out.println("10000 원 단위의 금액을 입력하세요");
					System.out.println("----------------------------------");
				}

			}
			else if(input == 3) {
				// 계좌조회
				this.showBalance();

			}
			else if(input == 4) {
				// 종료
				System.out.println(bankName + "의 잔액: " + this.initMoney + "원");
				break;

			}
			else
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}

	}

	public MyBankAccount(String bankName, int initMoney, Scanner scanner) {
		this.bankName = bankName;
		this.scanner = scanner;

	}

}
