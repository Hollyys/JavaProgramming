package MidTerm;
// 2017110157 신성한
public class YutPlayApp {
	
	public static void print(YutPlayer player) {
		String line = "----------------------------------------------";
		
		System.out.println(line);
		System.out.print("	도\t개\t걸\t윷\t모   단위(%)\n");
		System.out.println(line);
		System.out.printf("%s   ",player.name);
		for(int i=0; i<5; i++)
			System.out.printf("%3.1f\t",player.rate[i]/player.cnt*100.0);
		System.out.println();
		System.out.println(line);
	}
	
	public static void play(YutPlayer player1, YutPlayer player2) {
		while(true) {
			player1.play();
			if(player1.total_score >= 20 || player2.total_score >= 20)
				break;
			player2.play();
			if(player1.total_score >= 20 || player2.total_score >= 20)
				break;
		}
		
		System.out.println();
		System.out.print(player1.name + ": " + player1.total_score + ", ");
		System.out.print(player2.name + ": " + player2.total_score);
		if(player1.total_score >= 20) {
			System.out.println(" ==> " + player1.name + " 승리");
		}
		else {
			System.out.println(" ==> " + player2.name + " 승리");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		YutPlayer player1 = new YutPlayer("새롱", 0);
		YutPlayer player2 = new YutPlayer("봉다리", 1);
		
		play(player1,player2);
		print(player1);
		print(player2);

	}

}
