package inheritanceHomework;

public class Main {

	public static void main(String[] args) {
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		Instructor engin = new Instructor();
		engin.firstName = "Engin";
		Student mert = new Student();
		mert.firstName = "Mert";
		instructorManager.add(engin);
		studentManager.add(mert);
		
		
	}

}
