package Chapter04;

public class WhileSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int i=1;
		int sum_limit = 100;
		
		while(i<=sum_limit) {
			sum += 1;
			i++;
		}
		System.out.println("1~" + sum_limit + "합: "+sum);

	}

}
