package  Chapter14.sec05.exam01;
	
import java.awt.Toolkit;
	
public class SleepExample {
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<10; i++) {
			toolkit.beep();
			try {
				Thread.sleep(3000);
			} catch(InterruptedException e) {
				// interrupt() 메소드가 호출되면 실행 
				System.out.println("InterruptedException 발생");
			}
		}
	}
}