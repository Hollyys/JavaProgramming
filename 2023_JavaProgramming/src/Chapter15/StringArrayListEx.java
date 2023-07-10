package Chapter15;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList<String>();

		Scanner scanner = new Scanner(System.in); for(int i=0; i<4; i++) {
			System.out.println("이름을 입력하세요>> "); String s = scanner.next();
			strList.add(s);
		}
		for(int i=0; i < strList.size(); i++) {
			String name = strList.get(i);
			System.out.print(name + ", ");
		}
		int longestIndex = 0;
		for(int i=1; i < strList.size(); i++) {
			if(strList.get(longestIndex).length() < strList.get(i).length()) longestIndex = i;
		}
		System.out.println("");
		System.out.println("가장 긴 이름은 : " + strList.get(longestIndex));
		scanner.close();
	}

}
