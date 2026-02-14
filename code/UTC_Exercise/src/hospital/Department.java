package hospital;

import java.util.ArrayList;
import people.Doctor;

public class Department {
	private String name;
	private Doctor headDoctor;
	private ArrayList<Doctor> doctors;
	
	public Department(String name) {
		this.name = name;
		doctors = new ArrayList<>();
	}

	public Doctor getHeadDoctor() {
		return headDoctor;
	}

	public void setHeadDoctor(Doctor headDoctor) {
		this.headDoctor = headDoctor;
	}
	
	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	public String getName() {
		return name;
	}
}
