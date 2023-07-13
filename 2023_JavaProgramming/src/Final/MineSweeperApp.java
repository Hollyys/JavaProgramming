// 2017110157 신성한

package Final;

class Player extends Thread{
	String name = "";
	String mine[][];
	int lifetime = 3;
	
	synchronized public void setPosition() {
		int x = (int)(Math.random()*7);
		int y = (int)(Math.random()*7);
		
		Thread.yield();
		
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(mine[x][y].equals("B")) {
			String input = mine[x][y] + this.name;
			mine[x][y] = input;
			lifetime--;
		}
		else if(mine[x][y].equals(" ")) {
			mine[x][y] = String.valueOf(lifetime);
		}
	}
	
	public Player(String name, String mine[][]) {
		this.name = name;
		this.mine = mine;
	}
	
	public void run() {
		setPosition();
	}
}

public class MineSweeperApp {
	public static void printMine(String mine[][]) {
		String line = "+---------------------------+";
		for(int i=0; i<7; i++) {
			System.out.println(line);
			for(int j=0; j<7; j++) {
				System.out.printf("|%2s ", mine[i][j]);
			}
			System.out.println("|");
		}
		System.out.println(line);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mine[][] = new String[7][7];
		int minCount = 0;
		
		for(int i=0; i<7; i++) {
			for(int j=0; j<7; j++) {
				mine[i][j] = " ";
			}
		}
		
		while(minCount < 10) {
			int x = (int)(Math.random()*7);
			int y = (int)(Math.random()*7);
			
			if(!mine[x][y].equals("B")) {
				mine[x][y] = "B";
				minCount++;
			}
		}
		printMine(mine);
		
		Thread p1 = new Player("1", mine);
		Thread p2 = new Player("2", mine);
		Thread p3 = new Player("3", mine);
		Thread p4 = new Player("4", mine);
		Thread p5 = new Player("5", mine);
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		
		printMine(mine);
		
		System.out.println();

	}

}
