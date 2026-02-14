package people;

import java.util.ArrayList;

public class Doctor {
	private int id;
	private String name;
	private String speciality;
	private int fee;
	private ArrayList<Patient> patients;
	
	public Doctor(int id, String name, String speciality, int fee) {
		this.id = id;
		this.name = name;
		this.speciality = speciality;
		this.fee = fee;
		patients = new ArrayList<>();
	}
	
	public void addPatient(Patient p) {
		// TODO Auto-generated method stub
		patients.add(p);
	}
	
	public void processVisit(Patient p, String visitDetails) {
		// TODO Auto-generated method stub
	}
	
	public String getName() {
		return name;
	}
	
	public String getSpeciality() {
		return speciality;
	}
	
	public ArrayList<Patient> getPatients() {
		return patients;
	}
	
	public int getFee() {
		return fee;
	}
}
