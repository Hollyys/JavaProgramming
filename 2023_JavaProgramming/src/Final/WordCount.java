// 2017110157 신성한
package Final;


public class WordCount {
	String str;
	
	public void getAlphabetCount() {
		String[] arr = str.split(" ");
		int size = arr.length;
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		int cnt = 0;

		System.out.println("단어 개수: " + size);
		cnt = 0;
		
		for(String token : arr) {
			cnt++;
			System.out.printf("%20s",token);
			
			String[] arrT = token.split("");
			for(String tokenT : arrT) {
//				System.out.println(tokenT);
//				if(tokenT>="A" && tokenT<="Z")
			}
			if(cnt%6 == 0)
				System.out.println();
		}
		
		for(int i=0; i<26; i++) {
			cnt1[i] = 0;
			cnt2[i] = 0;
		}
		
		System.out.println();
		System.out.println("\n소문자 개수: ");
		for(int i=0; i<26; i++)
			System.out.printf("[%c]:%3d ",(char)i+97, cnt1[i]);
		
		System.out.println();
		System.out.println("\n대문자 개수: ");
		for(int i=0; i<26; i++)
			System.out.printf("[%c]:%3d ",(char)i+65, cnt2[i]);
		
		System.out.println();
		
	}
	
	public WordCount(String str) {
		this.str = str;
	}

}
