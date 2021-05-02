package inheritanceHomework;

public class InstructorManager extends UserManager {
	 @Override
	public void add(User user) {
	    	System.out.println("Instructor " + user.firstName + " is added");
	 }
	 
	 public void increaseLevel(Instructor instructor) {
		 instructor.professionStar++;
		 System.out.println("Your profession level is " + instructor.professionStar);
	 }
	 public void addLesson(){
		 System.out.println("New lesson is added");
	 }
	 
}
