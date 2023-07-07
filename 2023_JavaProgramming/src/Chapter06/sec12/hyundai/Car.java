package Chapter06.sec12.hyundai;

import java.util.Scanner;

import Chapter06.sec12.hankook.*;
import Chapter06.sec12.kumho.AllSeasonTire;

class Car {							// 접근제한자 명시 안 하면 default로 간주
	Chapter06.sec12.hankook.Tire tire1 = new Chapter06.sec12.hankook.Tire();
	Chapter06.sec12.kumho.Tire tire2 = new Chapter06.sec12.kumho.Tire();
	
	SummerTire tire3 = new SummerTire();
	AllSeasonTire tire4 = new AllSeasonTire();
	
	Scanner scanner1 = new Scanner(System.in);
	java.util.Scanner scanner2 = new java.util.Scanner(System.in);

}
