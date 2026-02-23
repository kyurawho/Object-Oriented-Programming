package lms;

import java.util.ArrayList;

public class Faculty {
	private String facultyId;
	private String facultyName;
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Teacher> teachers = new ArrayList<Teacher>();
	private ArrayList<CourseClass> classes = new ArrayList<CourseClass>();
	
	public Faculty(String facultyId, String facultyName) {
		this.facultyId = facultyId;
		this.facultyName = facultyName;
	}
	
	public void addStudent(Student s) {
		students.add(s);
		
		s.setFaculty(this);
	}
	
	public void addTeacher(Teacher t) {
		teachers.add(t);
		
		t.setFaculty(this);
	}
	
	public void addClass(CourseClass c) {
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
		System.out.println("Faculty: " + facultyName);
		System.out.println();
		
		for (CourseClass courseClass : classes) {
			System.out.println("Class: " + courseClass.getClassName());
			Teacher t = courseClass.getTeacher();
			System.out.println("Teacher: " + t.getName());
			System.out.println("Students:");
			for (Student student : courseClass.getStudents()) {
				System.out.println("- " + student.getName());
			}
			System.out.println();
		}

	}
	
}
