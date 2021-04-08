import java.util.Scanner;

public class Student {
	
	String name;
	int semester;
	double gpa;
	double charge;
	double paid;
	double weight;
	double height;
	int sem;
	int totalCreditHr;
	int[] creditHr;

	Scanner s = new Scanner(System.in);

	
	void printStudent() {
		System.out.println("\n-----Student's Info-----");
		System.out.printf("%-30s: ","Enter student's name");
		String name = s.nextLine();
		
		System.out.printf("%-30s: ","Enter student's semester");
		int semester = s.nextInt();
		
		System.out.printf("%-30s: ","Enter student's gpa");
		double gpa = s.nextDouble();
		System.out.println("--------------------");
		System.out.printf("%-10s: %s%n", "Name", name);
		System.out.printf("%-10s: %d%n", "Semester" , semester);
		System.out.printf("%-10s: %.1f%n%n", "GPA" , gpa);
	}

	
	void financialStatement() {
		System.out.println("\n---Student's Financial Statement---");
		System.out.printf("%-30s: ","Please enter the charge: ");
		double charge = s.nextDouble();
		
		System.out.printf("%-30s: ","Please enter paid amount: ");
		double paid = s.nextDouble();
		
		double balance = paid - charge;
		System.out.println("--------------------");
		System.out.printf("%-10s: %.2f%n","Charge", charge);
		System.out.printf("%-10s: %.2f%n","Payment", paid);
		System.out.printf("%-10s: %.2f%n","Balance", balance);
		
		if(balance >= 0) 
			System.out.printf(">>>The fee is fully paid.\n>>>Balance remaining: RM%.2f%n%n", balance);
		else {
			System.out.println(">>>Unfortunately, the fee is not fully paid.");
			System.out.printf(">>>Charge needed to be paid: RM%.2f%nNeed assistance? Hotline: 012-345-6789.%n%n", Math.abs(balance));
		}
	}

	
	void health(){
		double weight;
		double height;
		System.out.println("\n------Health------");
		System.out.printf("%-30s: ","Enter student's weight(kg): ");
		weight = s.nextDouble();
		System.out.printf("%-30s: ","Enter student's height(m): ");
		height = s.nextDouble();
		
		System.out.println("--------------------");
		System.out.printf("%-10s: %.1f%n", "Weight (kg)" , weight);
		System.out.printf("%-10s: %.2f%n", "Height (m)" , height);
		
		double bmi = weight / (height * height);
		System.out.printf("%-10s: %.2f%n", "BMI", bmi);
		
		if(bmi < 18.5)
			System.out.println(">>>Underweight");
		else if(bmi < 25)
			System.out.println(">>>Normal weight");
		else if(bmi <= 30)
			System.out.println(">>>Overweight");
		else
			System.out.println(">>>Very overweight");
		
		System.out.println("");
		
	}
	
	
	
	void academic(){

		int creditHrPassed = 0;
		
		System.out.println("\n-----Academic-----");
		System.out.printf("%-30s: ","Enter total semester");
		sem = s.nextInt();
		
		System.out.printf("%-30s: ","Enter total credit hour");
		totalCreditHr = s.nextInt();
		
		creditHr = new int[sem];
		System.out.println("Enter the credit hour for each semester.\nEnter '0' if student haven't register for the semester.\n");
		
		System.out.printf("%-10s| %-10s%n", "Semester", "Credit Hour Taken");
		for(int i = 0; i < sem; i++) {
			System.out.printf("%-10d| ",(i+1));
			creditHr[i] = s.nextInt();
			System.out.println();

			
		}
		
		System.out.println("--------------------");
		System.out.printf("%-20s: %d%n", "Total semester of the course", sem);
		
		System.out.printf("|%-13s|", "Semester");
		for(int a = 0; a < sem; a++)
			System.out.printf("%-5d|", a+1);
		
		System.out.printf("%n|%-13s|", "Credit Hour");
		for(int index = 0; index < creditHr.length; index++) {
			
			if(creditHr[index] == 0) 
				System.out.printf("%-5s|", "-");
			else
				System.out.printf("%-5d|", creditHr[index]);

		}
		
		for(int index = 0; index < creditHr.length; index++) 
			creditHrPassed += creditHr[index];
		
		
		System.out.printf("%n%-30s: %d%n","Total credit hour required: ", totalCreditHr);
		System.out.printf("%-30s: %d%n", "Credit hour taken: ", creditHrPassed );
		System.out.printf("%-30s: %d%n%n", "Credit hour incomplete: ", (totalCreditHr - creditHrPassed));
		
	}
	
}
