import java.util.ArrayList;

public class Teacher {
	private String teacherId;
	private String name;
	private Faculty faculty;
	private ArrayList<CourseClass> teachingClasses;
	
	public Teacher(String teacherId, String name) {
		this.teacherId = teacherId;
		this.name = name;
		this.teachingClasses = new ArrayList<>();
	}
	
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	
	public void teachClass(CourseClass c) {
		// TODO Auto-generated method stub
		teachingClasses.add(c);
		c.setTeacher(this);
	}
	
	public ArrayList<CourseClass> getTeachingClasses() {
		return teachingClasses;
	}
	
	public String getName() {
		return name;
	}
}
