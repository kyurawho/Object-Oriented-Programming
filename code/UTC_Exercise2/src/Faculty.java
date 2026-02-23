import java.util.ArrayList;

public class Faculty {
	private String facultyId;
	private String facultyName;
	private ArrayList<Student> students;
	private ArrayList<Teacher> teachers;
	private ArrayList<CourseClass> classes;
	
	public Faculty(String facultyId, String facultyName) {
		this.facultyId = facultyId;
		this.facultyName = facultyName;
		this.students = new ArrayList<>();
		this.teachers = new ArrayList<>();
		this.classes = new ArrayList<>();
	}
	
	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		students.add(s);
	}
	
	public void addTeacher(Teacher t) {
		// TODO Auto-generated method stub
		teachers.add(t);
	}
	
	public void addClass(CourseClass c) {
		// TODO Auto-generated method stub
		classes.add(c);
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	
	public ArrayList<Teacher> getTeachers() {
		return teachers;
	}
	
	public ArrayList<CourseClass> getClasses() {
		return classes;
	}
	
	public void printAllClassesDetail() {
		// TODO Auto-generated method stub
		System.out.println("Faculty: " + facultyName);
		System.out.println();
		
		for (CourseClass courseClass : classes) {
			System.out.println("Class: " + courseClass.getClassName());
			
			System.out.println("Teacher: " + courseClass.getTeacher().getName());
			
			System.out.println("Students: ");
			for (Student student : courseClass.getStudents()) {
				System.out.println("- " + student.getName());
			}
			System.out.println();
		}
	}
}
