package inheritanceHomework;

public class Instructor extends User{
	String instructorId;
	int professionStar;
	
	public Instructor(int id, String firstName, String lastName, String email, String password,String instructorId,
			int professionStar) {
		this.instructorId = instructorId;
		this.professionStar = professionStar;
	}
	
	public Instructor() {
		
	}
}
