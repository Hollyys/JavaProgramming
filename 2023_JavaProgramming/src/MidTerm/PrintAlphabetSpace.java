package MidTerm;
// 2017110157 신성한

public class PrintAlphabetSpace {
	char ch_start;
	char ch_end;
	int intValue_start = ch_start;
	int intValue_end = ch_end;
	
	public void function() {
		char ch;
		
		for(ch = ch_start; ch<intValue_end; ch+=2) {
			int intValue = ch;
			for(int j = 0; j < (intValue - intValue_start); j++) {
				System.out.print(".");
			}
			System.out.printf("%c%c (%d)\n",ch,ch+1,intValue - intValue_start);
		}
		
		ch = (char) (ch_end-3);
		
		for(; ch>=intValue_start; ch-=2) {
			int intValue = ch;
			for(int j = 0; j < (intValue - intValue_start); j++) {
				System.out.print(".");
			}
			System.out.printf("%c%c (%d)\n",ch,ch+1,intValue - intValue_start);
		}
	}
	
	public PrintAlphabetSpace(char ch_start, char ch_end) {
		this.ch_start = ch_start;
		this.ch_end = ch_end;
		this.intValue_start = ch_start;
		this.intValue_end = ch_end;
	}
}
