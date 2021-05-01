package inheritanceWork;

public class StudentManager{
	public void registerCourses(Student student) {
		System.out.println(student.getFirstName());
		for (String course : student.getCourses()) {
            System.out.println(course + " kursuna başarıyla kaydoldu.");
        }
	}
}
