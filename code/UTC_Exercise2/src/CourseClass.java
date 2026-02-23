import java.util.ArrayList;

public class CourseClass {
	private String classId;
	private String className;
	private Faculty faculty;
	private Teacher teacher;
	private ArrayList<Student> students;
	
	public CourseClass(String classId, String className, Faculty faculty) {
		this.classId = classId;
		this.className = className;
		this.faculty = faculty;
		this.students = new ArrayList<>();
	}
	
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		students.add(s);
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public String getClassName() {
		return className;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
}
