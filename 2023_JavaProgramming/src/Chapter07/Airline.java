package Chapter07;

public class Airline extends Reservation{
	
	public Airline(int input) {
		number = input;
	}
	public void print() {
		System.out.println(number);
		change();
		System.out.println(number);
	}
}
