package lms;

import java.util.ArrayList;

public class CourseClass {
	private String classId;
	private String className;
	private Faculty faculty;
	private Teacher teacher;
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public CourseClass(String classId, String className, Faculty faculty) {
		this.classId = classId;
		this.className = className;
		this.faculty = faculty;
	}

	public ArrayList<Student> getStudents() {
		return students;
	}

	public void addStudent(Student s) {
		students.add(s);

	}

	public void setTeacher(Teacher t) {
		this.teacher = t;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public String getClassName() {
		return className;
	}
	
}
