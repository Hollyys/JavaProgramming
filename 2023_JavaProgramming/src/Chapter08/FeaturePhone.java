package Chapter08;

public class FeaturePhone implements PhoneInterface {

	@Override
	public void sendCall() {
		// TODO Auto-generated method stub
		System.out.println("전화 발신");
	}

	@Override
	public void receiveCall() {
		// TODO Auto-generated method stub
		System.out.println("전화가 왔습니다.");
	}
	public void flash() {
		System.out.println("플래쉬가 켜졌습니다.");
	}

}
