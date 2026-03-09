package hospital;

import java.util.*;
import people.Patient;
import people.Doctor;

public class Hospital {
	private String name;
	private ArrayList<Department> departmens;
	private ArrayList<Department> patients;
	
	public Hospital(String name) {
		this.name = name;
		this.departmens = new ArrayList<>();
		this.patients = new ArrayList<>();
	}
	
	public void addDepartment(Department d) {
		departmens.add(d);
	}
	
	public void registerPatient(Patient p) {
		// TODO Auto-generated method stub
		
	}
	
	public void processVisit(Patient p, Doctor d, String visitDetails) {
		// TODO Auto-generated method stub
		
	}

	public void displayHospitalInfo() {
		// TODO Auto-generated method stub
		System.out.println("Hospital: " + name);
		
		System.out.println("Deparments: ");
		for (Department department : departmens) {
			System.out.printf("- %s (Head doctor: %s)\n", department.getName(), department.getHeadDoctor());
		}
	}
}
