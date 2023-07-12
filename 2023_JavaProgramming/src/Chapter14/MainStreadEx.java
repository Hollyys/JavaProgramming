package Chapter14;

public class MainStreadEx {
	public static void main(String[] args) {
		String data = "Hello";
		int i=0;
		if(data != null) {
			System.out.println(data);
		}
		
		while(i<10) {
			i++;
		}
		
		System.out.println("...");
	}
	
	public interface Runnable {
		public abstract void run();
	}
}
