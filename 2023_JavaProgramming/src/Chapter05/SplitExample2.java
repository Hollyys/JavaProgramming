package Chapter05;

public class SplitExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "boo:and:foo";
		String[] splited1 = str1.split(":");
		for(int i=0; i<splited1.length; i++)
			System.out.println(splited1[i]);
		System.out.println();
		
		String str2 = "aaa bbb ccc";
		String[] splited2 = str2.split(" ");
		for(int i=0; i<splited2.length; i++)
			System.out.println(splited2[i]);
		System.out.println();
		
		String str3 = "Porsche,911,gt3,rs";
		String[] splited3 = str3.split(",");
		for(int i=0; i<splited3.length; i++)
			System.out.println(splited3[i]);
		System.out.println();
		
		String str4 = "Porsche,911_gt3 rs";
		String[] splited4 = str4.split(",|_| ");
		for(int i=0; i<splited4.length; i++)
			System.out.printf("[%d]: %s\n", i, splited4[i]);
		System.out.println();

	}

}
