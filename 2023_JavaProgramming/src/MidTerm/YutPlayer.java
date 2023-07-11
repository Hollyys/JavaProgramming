package MidTerm;
// 2017110157 신성한
public class YutPlayer {
	String name = "";
	String pointer1 = " ---> ";
	String pointer2 = " <--- ";
	String tab = "			";
	int flag;
	int yut[] = new int[4];		// 도	개	 걸	  윷	    모
	double rate[] = new double[] {0.0, 0.0, 0.0, 0.0, 0.0};
	double cnt = 0.0;
	int total_score = 0;
	
	public void print(int score, int sum) {
		if(flag == 0) {
			System.out.print(name + " [");
			for(int i = 0; i < 4; i++) 
				System.out.print(yut[i]);
			System.out.print("] ");
			if(sum == 4)
				System.out.print("모 ");
			else if(sum == 0)
				System.out.print("윷 ");
			else if(sum == 1)
				System.out.print("걸 ");
			else if(sum == 2)
				System.out.print("개 ");
			else
				System.out.print("도 ");
			System.out.printf("( %d점/총 %2d점)%s\n", score, total_score, pointer1);
		}
		else {
			System.out.print(tab + pointer2 + name + " [");
			for(int i = 0; i < 4; i++) 
				System.out.print(yut[i]);
			System.out.print("] ");
			if(sum == 4)
				System.out.print("모 ");
			else if(sum == 0)
				System.out.print("윷 ");
			else if(sum == 1)
				System.out.print("걸 ");
			else if(sum == 2)
				System.out.print("개 ");
			else
				System.out.print("도 ");
			System.out.printf("( %d점/총 %3d점)\n", score, total_score);
		}
	}
	
	public void play() {
		int sum = 0;
		int one_score;
		
		for(int i = 0; i < 4; i++) {
			int score = (int)(Math.random()*2);
			yut[i] = score;
			sum += score;
		}
		cnt += 1.0;
		
		if(sum == 4) { // 모 4
			one_score = 5;
			total_score += one_score;
			rate[4] += 1.0;
			
			print(one_score, sum);
			
			if(total_score < 20)
				play();
		}
		else if(sum == 0) { // 윷 3
			one_score = 4;
			total_score += one_score;
			rate[3] += 1.0;
			
			print(one_score, sum);
			
			if(total_score < 20)
				play();
		}
		else if(sum == 1) { // 걸 2
			one_score = 3;
			total_score += one_score;
			rate[2] += 1.0;
			
			print(one_score, sum);
			
		}
		else if(sum == 2) { // 개 1
			one_score = 2;
			total_score += one_score;
			rate[1] += 1.0;
			
			print(one_score, sum);
		}
		else { // 도 0
			one_score = 1;
			total_score += one_score;
			rate[0] += 1.0;
			
			print(one_score, sum);
		}
	
	}
	
	public YutPlayer(String name, int flag) {
		this.name = name;
		this.flag = flag;
	}
}
