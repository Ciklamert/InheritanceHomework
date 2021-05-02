package inheritanceHomework;

public class Student extends User{
	String studentId;
	int attendance;
	public Student(int id, String firstName, String lastName, String email, String password, String studentId,
			int attendance) {
		this.studentId = studentId;
		this.attendance = attendance;
	}
	public Student() {
		
	}
}
