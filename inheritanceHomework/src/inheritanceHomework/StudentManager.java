package inheritanceHomework;

public class StudentManager extends UserManager {
     @Override
	public void add(User user) {
    	 System.out.println("Student " + user.firstName + " is added");
     }
     
     public void increaseLevel(Student student) {
    	 student.attendance+=5;
    	 System.out.println("Your attendance is " + student.attendance);
     }
     
     public void uploadHomework() {
    	 System.out.println("Homework yüklendi.");
     }
}
