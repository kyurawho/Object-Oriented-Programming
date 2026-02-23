import java.util.ArrayList;

public class Student {
	private String studentId;
	private String name;
	private Faculty faculty;
	private ArrayList<CourseClass> enrolledClasses;
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		this.enrolledClasses = new ArrayList<>();
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void takeClass(CourseClass c) {
		// TODO Auto-generated method stub
		enrolledClasses.add(c);
		c.addStudent(this);
	}
	
	public ArrayList<CourseClass> getEnrolledClasses() {
		return enrolledClasses;
	}
	
	public String getName() {
		return name;
	}
}
