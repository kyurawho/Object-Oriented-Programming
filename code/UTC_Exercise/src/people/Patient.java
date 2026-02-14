package people;

import java.util.ArrayList;

public class Patient {
	private int id;
	private String name;
	private int age;
	private ArrayList<String> medicalRecords;
	private int totalSpent;
	
	public Patient(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		medicalRecords = new ArrayList<>();
		totalSpent = 0;
	}
	
	public void addMedicalRecord(String record) {
		// TODO Auto-generated method stub
		medicalRecords.add(record);
	}
	
	public void addTotalSpent(int totalSpent) {
		// TODO Auto-generated method stub
		this.totalSpent += totalSpent;
	}
	
	public ArrayList<String> getMedicalRecords() {
		return medicalRecords;
	}
	
	public int getTotalSpent() {
		return totalSpent;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getId() {
		return id;
	}
}
