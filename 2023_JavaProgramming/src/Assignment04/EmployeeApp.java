package Assignment04;
// 20171100157 신성한
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staff[] staffs = new Staff[3];
		Engineer[] engineers = new Engineer[3];
		
		for(int i=0; i<3; i++) {
			staffs[i] = new Staff();
			engineers[i] = new Engineer();
		}

		staffs[0].setName("John", "Smith");
		staffs[0].setAge(25);
		staffs[0].setPosition("Newcomer");
		staffs[0].setSalary(300);

		staffs[1].setName("Marry", "Anne");
		staffs[1].setAge(45);
		staffs[1].setPosition("Executive");
		staffs[1].setSalary(600);

		staffs[2].setName("Sue", "Jones");
		staffs[2].setAge(38);
		staffs[2].setPosition("Office Manager");
		staffs[2].setSalary(450);

		engineers[0].setName("Bob", "Lewis");
		engineers[0].setAge(28);
		engineers[0].setPosition("Junior Engineer");
		engineers[0].setSalary(350);
		engineers[0].setOverWorkingDay(17);

		engineers[1].setName("Lisa", "Barnes");
		engineers[1].setAge(37);
		engineers[1].setPosition("Senior Engineer");
		engineers[1].setSalary(580);
		engineers[1].setOverWorkingDay(20);

		engineers[2].setName("Michael", "Kevin");
		engineers[2].setAge(46);
		engineers[2].setPosition("SW Manager");
		engineers[2].setSalary(650);
		engineers[2].setOverWorkingDay(20);

		String line1 = "========================================================";
		String line2 = "----------------------------------------------------------------";

		while(true) {
			System.out.println(line1);
			System.out.println("1. Display all employees' information (Staff, Engineer)");
			System.out.println("2. Display all staffs' information");
			System.out.println("3. Display all engineers' information");
			System.out.println("4. Display all employees' name, salary, annual salary");
			System.out.println("5. Display all employees' name, position");
			System.out.println("0. Quit");
			System.out.println(line1);
			System.out.print("-> ");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();

			if(input == 0){
				System.out.println("Bye!");
				scanner.close();
				System.exit(0);
			}
			else if(input == 1) {
				// Display all employees' information
				System.out.println();
				System.out.println("[Staff]");
				System.out.println("\t   Name\t Age\t\tPosition  Salary  Annual Salary");
				System.out.println(line2);
				for(int i=0; i<3;i++)
					staffs[i].printEmployee();

				System.out.println();
				System.out.println("[Engineers]");
				System.out.println("\t   Name\t Age\t\tPosition  Overworking Pay  Salary  Annual Salary");
				System.out.println(line2+"-----------------");
				for(int i=0; i<3;i++)
					engineers[i].printEmployee();
				
				System.out.println();
			}
			else if(input == 2) {
				// Display all staffs' information
				System.out.println();
				System.out.println("[Staff]");
				System.out.println("\t   Name\t Age\t\tPosition  Salary  Annual Salary");
				System.out.println(line2);
				for(int i=0; i<3;i++)
					staffs[i].printEmployee();
				
				System.out.println();
			}
			else if(input == 3) {
				// Display all engineers' information
				System.out.println();
				System.out.println("[Engineers]");
				System.out.println("\t   Name\t Age\t\tPosition  Overworking Pay  Salary  Annual Salary");
				System.out.println(line2+"-----------------");
				for(int i=0; i<3;i++)
					engineers[i].printEmployee();
				
				System.out.println();
			}
			else if(input == 4) {
				// Display all employees' name, salary, annual salary
				System.out.println();
				System.out.println("[Staff]");
				System.out.println("\t   Name  Salary  Annual Salary");
				System.out.println("---------------------------------------");
				for(int i=0; i<3;i++)
					System.out.printf("%15s%8d%14d\n", staffs[i].name, staffs[i].salary, staffs[i].annualSalary);

				System.out.println();
				System.out.println("[Engineers]");
				System.out.println("\t   Name  Salary  Annual Salary");
				System.out.println("---------------------------------------");
				for(int i=0; i<3;i++)
					System.out.printf("%15s%8d%14d\n", engineers[i].name, engineers[i].salary, engineers[i].annualSalary);
				
				System.out.println();
			}
			else if(input == 5) {
				// Display all employees' name, position
				System.out.println();
				System.out.println("[Staff]");
				System.out.println("\t   Name\t\t   Position");
				System.out.println("------------------------------------");
				for(int i=0; i<3;i++)
					System.out.printf("%15s%20s\n", staffs[i].name, staffs[i].position);

				System.out.println();
				System.out.println("[Engineers]");
				System.out.println("\t   Name\t\t   Position");
				System.out.println("------------------------------------");
				for(int i=0; i<3;i++)
					System.out.printf("%15s%20s\n", engineers[i].name, engineers[i].position);
				
				System.out.println();
			}
			else {
				System.out.println("Wrong input. Try again!");

			}

		}

	}

}
