package Chapter14;

import java.util.Timer;
import java.util.TimerTask;

public class TimerEx01 {
	public static int count = 0;
	public static void main(String[] args) {
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				if(count < 5) {
					System.out.println(count);
					count++;
				}else {
					System.out.println("Timer 종료");
					timer.cancel();
				}				
			}			
		};
		timer.schedule(task,  1000, 1000);
	}

}
