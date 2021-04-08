
public class Main {
	public static void main(String[] args) {
		Student student1 = new Student();
				
		student1.printStudent();
		student1.financialStatement();
		student1.health();
		student1.academic();
		
		System.out.println();
		
		Student student2 = new Student(); 
		
		student2.printStudent();
		student2.financialStatement();
		student2.health();
		student2.academic();	
	}

}
