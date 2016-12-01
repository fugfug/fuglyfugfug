
public class Student {
	//instance data variables
	private String name;
	private String id;
	private boolean tuitionStatus;
	public final boolean DEFAULT_TUITION_STATUS = true;

	//constructor
	public Student(String studentName, String studentID) {
		name = studentName;
		id = studentID;
		tuitionStatus = DEFAULT_TUITION_STATUS;
	}
	
	//getters
	public String getName() {
		return name;
	}
	public String getID() {
		return id;
	}
	public boolean isTuitionPaid() {
		return tuitionStatus;
	}
	
	//setters
	public void setName(String newName) {
		name = newName;
	}
	public void setID(String newID) {
		id = newID;
	}
	
	//toString
	public String toString() {
		return "name:" + name + " \t id: " + id ;
	}


	
	
	

}
