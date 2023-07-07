package Assignment05;
import java.util.Scanner;

// 2017110157 신성한
public class ReservationApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AirlineSystem airlineSystem = new AirlineSystem(4,10);
		BusSystem busSystem = new BusSystem(3,10);
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.println("K-Startup의 통합 예약 시스템을 방문해 주셔서 감사합니다.");
			System.out.println("1. 항공사 예약 시스템");
			System.out.println("2. 버스 예약 시스템");
			System.out.println("0. 통합 예약 시스템 종료");
			System.out.println("----------------------------------------------");
			System.out.print("메뉴를 선택해주세요: ");
			int input1 = scanner.nextInt();

			if(input1 == 1) {
				//항공사 예약 시스템
				while(true) {
					airlineSystem.print();
					int input2 = scanner.nextInt();

					if(input2 == 1) {
						//좌석 예약
						System.out.print("예약할 좌석 이름을 입력하세요: ");
						String input = scanner.next();
						airlineSystem.reserveTheSeat(input);
					}
					else if(input2 == 2) {
						//예약 취소
						System.out.print("취소할 좌석 이름을 입력하세요: ");
						String input = scanner.next();
						airlineSystem.cancelTheSeat(input);

					}
					else if(input2 == 3) {
						//예약 현황 조회
						airlineSystem.displaySeat("항공사 예약 시스템");

					}
					else if(input2 == 4) {
						//메인 메뉴로 돌아가기
						break;
					}
					else
						System.out.println("잘못된 입력입니다.");
				}

			}
			else if(input1 == 2) {
				//버스 예약 시스템
				while(true) {
					busSystem.print();
					int input2 = scanner.nextInt();

					if(input2 == 1) {
						//좌석 예약s
						System.out.print("예약할 좌석 이름을 입력하세요: ");
						String input = scanner.next();
						busSystem.reserveTheSeat(input);

					}
					else if(input2 == 2) {
						//예약 취소
						System.out.print("취소할 좌석 이름을 입력하세요: ");
						String input = scanner.next();
						busSystem.cancelTheSeat(input);

					}
					else if(input2 == 3) {
						//예약 현황 조회
						busSystem.displaySeat("버스 예약 시스템");

					}
					else if(input2 == 4) {
						//메인 메뉴로 돌아가기
						break;
					}
					else
						System.out.println("잘못된 입력입니다.");
				}
			}
			else if(input1 == 0) {
				//통합 예약 시스템 종료
				break;
			}
			else
				System.out.println("잘못된 입력입니다.");
		}
		scanner.close();

	}

}
