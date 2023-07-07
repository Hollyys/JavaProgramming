package Assignment02;
import java.util.Arrays;
import java.util.Scanner;

// 2017110157 신성한
public class MultipleLottoGame {
	public static boolean isExist(int[] array, int input) {
		for(int i=0; i<array.length; i++) {
			if(array[i] == input)
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		int win[] = new int[6];
		int lotto[][] = new int[5][6];
		String result[][] = new String[5][6];
		
		String line = "-----------------------------------";
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("Lotto 게임 횟수를 입력하세요: ");
			input = scanner.nextInt();
			
			System.out.println(line);
			
			if(input >= 1 && input <= 5)
			{
				// 진행
				for(int i=0; i<input; i++) {
					int cnt = 0;
					
					while(cnt < 6) {
						int r = (int)(Math.random() * 45) + 1;
						
						if(!isExist(win, r)) {
							win[cnt] = r;
							cnt++;
						}
					}
				}
				Arrays.sort(win);
				// 당첨번호 생성
					
				for(int i=0; i<input; i++) {
					int cnt = 0;
					
					while(cnt < 6) {
						int r = (int)(Math.random() * 45) + 1;
						
						if(!isExist(lotto[i], r)) {
							lotto[i][cnt] = r;
							cnt++;
						}
					}
				}
				// 번호 자동생성
				
				System.out.println("자동 생성 번호: ");
				for(int i=0; i<input; i++) {
					System.out.printf("[%2d] ", i+1);
					for(int j=0; j<6; j++) {
						System.out.printf("%4d", lotto[i][j]);
					}
					System.out.printf("\n");
				}
				System.out.println(line);
				// 자동생성 번호 출력
				
				System.out.print("당첨 번호:\t  ");
				for(int i=0; i<6; i++)
					System.out.printf("%4d", win[i]);
				System.out.print("\n");
				System.out.println(line);
				// 당첨 번호 출력
				
				for(int i=0; i<input; i++) {
					System.out.printf("Result[%d]:", i+1);
					for(int j=0; j<6; j++) {
						System.out.printf("%4d", lotto[i][j]);
						if(isExist(win,lotto[i][j]))
							result[i][j] = "O";
						else
							result[i][j] = "X";
					}
					System.out.println();
					System.out.print("\t  ");
					for(int j=0; j<6; j++)
						System.out.printf("%4s", result[i][j]);
					System.out.println("\n" + line);
				}
				// 결과 출력
				
				break;
			}
			else {
				System.out.println("1에서 5사이의 숫자를 다시 입력하세요.");
				System.out.println(line);
			}
		}
		scanner.close();
	}

}
