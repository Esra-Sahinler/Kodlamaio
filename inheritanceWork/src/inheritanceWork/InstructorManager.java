package inheritanceWork;

public class InstructorManager {
	public void createCourses(Instructor instructor) {
		System.out.println(instructor.getFirstName()+"in");
        for (String course : instructor.getCourses()) {
            System.out.println(course + " kursu ba�ar�yla olu�turuldu.");
        }
	}
}
