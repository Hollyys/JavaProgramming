package Chapter13;

// 2017110157 신성한
public class ReservationSystem implements ReservationInterface {
	String seatName[][];
	String seatIsEmpty[][];
	int allSeat;
	int reservatedSeat = 0;
	int row, col;

	@Override
	public void makeSeats(int row, int col) {
		// TODO Auto-generated method stub
		this.row = row;
		this.col = col;
		seatName = new String[row][col];
		seatIsEmpty = new String[row][col];
		
		allSeat = row*col;
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(i==0) {
					seatName[i][j] = (j+1)+"D";
				}
				else if(i==1) {
					seatName[i][j] = (j+1)+"C";
				}
				else if(i==2) {
					seatName[i][j] = (j+1)+"B";
				}
				else {
					seatName[i][j] = (j+1)+"A";
				}
			}
		}
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				seatIsEmpty[i][j] = "O";
			}
		}
	}

	@Override
	public int reserveSeat(String seatName) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(this.seatName[i][j].equals(seatName)) {
					
					if(seatIsEmpty[i][j].equals("X"))
						return -1;
					else {
						seatIsEmpty[i][j] = "X";
						reservatedSeat += 1;
						return 0;
					}
				}
			}
		}
		
		return 0;
	}

	@Override
	public int cancelSeat(String seatName) {
		// TODO Auto-generated method stub
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(this.seatName[i][j].equals(seatName)) {
					
					if(seatIsEmpty[i][j].equals("O"))
						return -1;
					else {
						seatIsEmpty[i][j] = "O";
						reservatedSeat -= 1;
						return 0;
					}
				}
			}
		}
		
		return 0;
	}

	@Override
	public void displaySeat(String systemTitle) {
		// TODO Auto-generated method stub
		System.out.print("["+systemTitle+" 예약 현황] ");
		System.out.print("예약 좌석: "+reservatedSeat+"/ ");
		System.out.println("총 좌석: "+allSeat+"\n");
		
		for(int i=0; i<row/2; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("[%3s] ", seatName[i][j]);
			}
			System.out.println();
			for(int j=0; j<col; j++) {
				System.out.printf("%3s   ", seatIsEmpty[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("-----------------------------------------------------------");
		System.out.println(" 앞                           통로                         뒤");
		System.out.println("-----------------------------------------------------------");
		
		for(int i=row/2; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("[%3s] ", seatName[i][j]);
			}
			System.out.println();
			for(int j=0; j<col; j++) {
				System.out.printf("%3s   ", seatIsEmpty[i][j]);
			}
			System.out.println();
		}
		System.out.println();

	}

}
