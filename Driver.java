
public class Driver {

	public static void main(String[] args) {
		Student[] stdnt = new Student[5];
		
		//6 students
		Student s1 = new Student("Student A", "QWERT1");
		Student s2 = new Student("Student B", "mnbv2");
		Student s3 = new Student("Student C", "3asdf");
		Student s4 = new Student("Student D", "POIU4");
		Student s5 = new Student("Student E", "lkjh5");
		Student s6 = new Student("Student F", "6zxcv");
		
		//create a course
		Course c1 = new Course("course", 5, stdnt);

		//print course
		System.out.println(c1);	
		System.out.println();

		//print roster
		System.out.println("print roster: ");
		c1.printRoster(); 		
		System.out.println();

		//add students to course
		stdnt = new Student[] {s1, s2, s3, s4, s5};
		c1.addStudents(stdnt);
		
		//tries to add the sixth student and prints a message if any add fails
		System.out.println("add 6th: ");		
		c1.addStudent(s6); 			
		System.out.println();

		//prints the roster
		System.out.println("print roster after add: ");
		c1.printRoster();
		System.out.println();
		
		//drops the third student from the course
		System.out.println("drop 3rd: ");
		c1.dropStudent(s3);
		System.out.println();

		//prints the roster
		System.out.println("print roster after drop: ");
		c1.printRoster();
		System.out.println();
		
		//tries again to add the sixth student to the course
		System.out.println("add 6th again: ");
		c1.addStudent(s6);
		System.out.println();
		
		//prints the roster
		System.out.println("roster after add: " ); 
		c1.printRoster();
	
	}
	


}
