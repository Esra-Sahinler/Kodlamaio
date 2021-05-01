package inheritanceWork;

public class Main {

	public static void main(String[] args) {
		String[] courses = {"C#","Java"};
		Instructor instructor = new Instructor();
		Student student = new Student();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		 student.setId(1);
	     student.setFirstName("Esra");
	     student.setLastName("�ahinler");
	     student.setEmail("esra@gmail.com");
	     student.setPassword("12345");
	     student.setCourses(courses);
	     student.setAddress("�stanbul");
	     
	     instructor.setId(1);
	     instructor.setFirstName("Engin");
	     instructor.setLastName("Demiro�");
	     instructor.setEmail("engin@engin.com");
	     instructor.setPassword("12345");
	     instructor.setCourses(courses);
	     
	     instructorManager.createCourses(instructor);

	     studentManager.registerCourses(student);

	}

}
