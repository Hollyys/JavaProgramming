package Chapter13;

public class Course {
	//모든 사람이 등록 가능
	public static void registerCourse1(Applicant<?> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+ "이(가) Course1을 등록함");
	}
	
	// Student 및 Student 자식 클래스만 등록 가능
	public static void registerCourse2(Applicant<? extends Student> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+ "이(가) Course2를 등록함");
	}
	
	// Worker 및 Person 클래스 등록 가능
	public static void registerCourse3(Applicant<? super Worker> applicant) {
		System.out.println(applicant.kind.getClass().getSimpleName()
				+ "이(가) Course3을 등록함");
	}

}
