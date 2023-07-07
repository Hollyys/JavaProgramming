package Assignment01;
// 2017110157 신성한
public class RandomAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		double average = 0.0;
		
		for(int i=0; i<10; i++)
		{
			int score = (int)(Math.random()*10) + 1;
			System.out.print(score + " ");
			total += score;
		}
		System.out.println();
		
		average = total/10.0;
		System.out.printf("총점: %d, 평균: %5.2f\n", total, average);

	}

}
