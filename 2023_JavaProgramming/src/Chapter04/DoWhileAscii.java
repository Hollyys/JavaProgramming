package Chapter04;

public class DoWhileAscii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char capital = 'A';
		char lower = 'a';
		String line = "------------------------------";
		
		System.out.println("ASCII Code Table");
		System.out.println(line);
		System.out.println("Chr Dec Hex\tChr Dec Hex");
		System.out.println(line);
		
		do {
			System.out.printf("%c: %3d, 0x%2x\t",
					capital, (int)capital, (int)capital);
			System.out.printf("%c: %3d, 0x%2x\n",
					lower, (int)lower, (int)lower);
			capital = (char)(capital + 1);
			lower = (char)(lower + 1);
		}while(capital <= 'Z' || lower <= 'z');
		System.out.println(line);
	}

}
