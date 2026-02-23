package lms;

import java.util.ArrayList;

public class Teacher {
	private String teacherId;
	private String name;
	private Faculty faculty;
	private ArrayList<CourseClass> teachingClasses = new ArrayList<CourseClass>();
	
	public Teacher(String teacherId, String name) {
		this.teacherId = teacherId;
		this.name = name;
	}
	
	public void setFaculty(Faculty f) {
		this.faculty = f;
	}
	
	public void teachClass(CourseClass c) {
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
