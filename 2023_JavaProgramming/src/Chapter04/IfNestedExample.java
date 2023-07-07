package Chapter04;

public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0; i<5; i++) {
			int score = (int)(Math.random()*20) + 81;
			
			System.out.println("점수: " + score);
			String grade;
			if(score >= 90) {
				grade = "A+";
			}
			else if(score >= 90) {
				grade = "A0";
			}
			else if(score >= 85){
				grade = "B+";
			}
			else {
				grade = "B0";
			}
				System.out.println("학점: " + grade);
				System.out.println("---------------");
		}
	}

}
