package Chapter11;

// 2017110157 신성한
public class AirlineSystem extends ReservationSystem {
	public AirlineSystem(int row, int col) {
		makeSeats(row, col);
		// TODO Auto-generated constructor stub
	}
	
	public void print() {
		System.out.println("-------------------------");
		System.out.println("항공사 예약 시스템");
		System.out.println("1. 좌석 예약");
		System.out.println("2. 예약 취소");
		System.out.println("3. 예약 현황 조회");
		System.out.println("4. 메인 메뉴로 돌아가기");
		System.out.println("-------------------------");
		System.out.print("번호를 선택해주세요: ");
	}
	
	public boolean isIn(String input) {
		
		for(int i=0; i<this.row; i++) {
			for(int j=0; j<this.col; j++) {
				if(this.seatName[i][j].equals(input)) {
					return true;
				}
			}
		}
		
		return false;
	}

	public void reserveTheSeat(String seatName) {
		
		boolean flag = isIn(seatName);
		if(!flag) {
			System.out.println(seatName + ": 좌석의 범위를 넘은 잘못된 좌석 이름입니다.");
			System.out.println("[예약 실패]: 잘못된 좌석 이름입니다.");
		}
		else {
			int result = super.reserveSeat(seatName);
			if(result == 0)
				System.out.println("[예약 성공] " + seatName);
			else if(result == -1) {
				System.out.print("[예약 실패] " + seatName);
				System.out.println(": 이미 예약된 좌석입니다.");
			}
		}
		
		super.displaySeat(seatName);
	}
	
	public void cancelTheSeat(String seatName) {
		boolean flag = isIn(seatName);
		if(!flag) {
			System.out.println(seatName + ": 좌석의 범위를 넘은 잘못된 좌석 이름입니다.");
			System.out.println("[예약 취소 실패]: 잘못된 좌석 이름입니다.");
		}
		else {
			int result = super.cancelSeat(seatName);
			if(result == 0)
				System.out.println("[예약 취소 성공] " + seatName);
			else if(result == -1) {
				System.out.print("[예약 취소 실패] " + seatName);
				System.out.println(": 예약 되지 않은 좌석입니다.");
			}
		}
		
		super.displaySeat(seatName);
	}
}
