

public class Course {
	private String course;
	private int max;
	private Student[] roster = new Student[max];

	public Course(String courseName, int maxStudents, Student[] students) {
		course = courseName;
		max = maxStudents;
		roster = students;
	}

	public boolean isThereRoom() {
		for (int i = 0; i < roster.length; i++) {
			if (roster[i] == null) {
				return true;
			}
		}
		return false;
	}

	//checks if student is on the roster
	public boolean isStudentThere(Student s) {
		for (int i = 0; i < roster.length; i++) {
			if (roster[i] == s) {
				return true;
			}
		}
		return false;
	}

	public int enrollment(Student s[]) {
		//checks number of students on roster
		//not counting nulls
		int j = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] != null) {
				j++;
			} 
		}
		return j;
	}

	//adds one student
	public boolean addStudent(Student s) {
		if (isThereRoom()) {	//there is room in the course/roster
			if (s.DEFAULT_TUITION_STATUS) {		//student has paid
				if (getIndex(roster, s) > roster.length)
					System.out.println(s + " cannot be added");
				for (int i = 0; i < roster.length; i++) {
					while (roster[i] == null) {		
						//replaces a dropped student with the new student
						roster[i] = s;
					}
				}
			}
			return true;
		} else {	//there is no room in the roster
			System.out.println("No space. \n" + s + " can't be added.");
			return false;
		}
	}

	//adds multiple students in an array at once
	public void addStudents(Student s[]) {
		if (isThereRoom()) {
			for (int i = 0; i < s.length; i++) {
				if (s[i].DEFAULT_TUITION_STATUS)
					roster = s;
			}
		}
	}

	//prints roster
	public void printRoster() {
		System.out.println("enrollment: " + enrollment(roster));
		for (int i = 0; i < roster.length; i++) {
			if (roster[i] != null) {
				System.out.println(roster[i]);
			} else if (roster[i] == null) {
				if (i ==0) { 
					// prints out "no one" only once  
					System.out.println("no one");
					while(i < -1) { //-1 to ensure dropped student info does not get printed
						//doesn't print a dropped student's info 
						break;
					}
				} 
			} 
		}
	}

	//drops a student
	public boolean dropStudent(Student s) {
		if (isStudentThere(s)) {	//checks if the student is on the roster
			for (int i = 0; i < roster.length; i++) {
				if (roster[i] == s) {
					roster[i] = null;	//replaces the dropped student with null
				}
			}
			return true;
		} else
			return false;
	}

	//gets the index of a student
	public int getIndex(Student st[], Student s) {
		int j = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i] == s) { // index of students on roster
				return i;
			} else // index of a student if they're not on roster
				j = j + 1;
		}
		return j;
	}

	//getters and setters
	public String getCourse() {
		return course;
	}

	public int getMax() {
		return max;
	}

	public void setCourse(String newCourse) {
		course = newCourse;
	}

	public void setMax(int newMax) {
		if (newMax > 0) {
			max = newMax;
		} else
			System.out.print("invalid");
	}

	//toString
	public String toString() {
		return "course name:" + course + "\tmax students: " + max;

	}

}
