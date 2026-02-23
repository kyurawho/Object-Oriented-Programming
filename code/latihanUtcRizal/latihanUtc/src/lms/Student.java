package lms;

import java.util.ArrayList;

public class Student {
	private String studentId;
	private String name;
	private Faculty faculty;
	private ArrayList<CourseClass> enrolledClasses = new  ArrayList<CourseClass>();
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}
	
	public void setFaculty(Faculty f) {
		this.faculty = f;
	}
	
	public void takeClass(CourseClass c) {
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
