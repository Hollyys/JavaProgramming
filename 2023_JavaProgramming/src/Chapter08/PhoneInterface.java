package Chapter08;

public interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	public abstract void sendCall(); // public abstract 생략 가능
	public abstract void receiveCall(); // public abstract 생략 가능
	public default void printLogo() { // 디폴트 메소드
		System.out.println("** Phone **");
	};

}
