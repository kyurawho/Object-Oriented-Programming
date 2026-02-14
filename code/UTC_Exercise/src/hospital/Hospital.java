package hospital;

import java.awt.desktop.PrintFilesEvent;
import java.util.ArrayList;

import main.Main;
import people.Patient;
import people.Doctor;

public class Hospital {
	private String name;
	private ArrayList<Department> departmens;
	private ArrayList<Patient> patiens;
	private int total;

	public Hospital(String name) {
		this.name = name;
		departmens = new ArrayList<>();
		patiens = new ArrayList<>();
		total = 0;
	}
	
	public void addDepartment(Department d) {
		// TODO Auto-generated method stub
		departmens.add(d);
	}
	
	public void registerPatient(Patient p) {
		// TODO Auto-generated method stub
		patiens.add(p);
	}
	
	public void processVisit(Patient p, Doctor d, String visitDetails) {
		// TODO Auto-generated method stub
//		d.addPatient(p);
		p.addMedicalRecord(visitDetails);
		p.addTotalSpent(d.getFee());
		total += d.getFee();
	}
	
	public void displayHospitalInfo() {
		// TODO Auto-generated method stub
		System.out.print("Hospital: ");
		System.out.println(name);
		
		System.out.println();
		
		System.out.println("Departments: ");
		for (Department department : departmens) {
			System.out.printf("- %s (Head Doctor: %s)\n", department.getName(), department.getHeadDoctor().getName());
		}
		
		System.out.println();
		
		System.out.println("Doctors: ");
		for (Department department : departmens) {
			System.out.printf("- %s (Speciality: %s, fee: %s)\n", department.getHeadDoctor().getName(), department.getHeadDoctor().getSpeciality(), Main.formatIDR(department.getHeadDoctor().getFee()));
			System.out.printf("\tPatients: \n");
			for(Patient patient: department.getHeadDoctor().getPatients()) {
				System.out.printf("\t- %s (Age: %d)\n", patient.getName(), patient.getAge());
			}
			
			for(Doctor doctor : department.getDoctors()) {
				System.out.printf("- %s (Speciality: %s, fee: %s)\n", doctor.getName(), doctor.getSpeciality(), Main.formatIDR(doctor.getFee()));				
				for(Patient patient: doctor.getPatients()) {
					System.out.printf("\t- %s (Age: %d)\n", patient.getName(), patient.getAge());
				}
			}
		}
		
		System.out.println();
		
		System.out.println("Patients:");
		for (Department department : departmens) {
			for(Patient patient: department.getHeadDoctor().getPatients()) {
				System.out.printf("-%s (ID: %d, Age: %d)\n", patient.getName(), patient.getId(), patient.getAge());
				System.out.printf("\tMedical Records: \n");
				for(String medicalRecord : patient.getMedicalRecords()) {
					System.out.printf("\t-Visited %s for %s (Cost: %s)\n", department.getHeadDoctor().getName(), medicalRecord, Main.formatIDR(department.getHeadDoctor().getFee()));
				}
			}
			
			System.out.println();
			
			for(Doctor doctor : department.getDoctors()) {
				for(Patient patient: doctor.getPatients()) {
					System.out.printf("-%s (ID: %d, Age: %d)\n", patient.getName(), patient.getId(), patient.getAge());
					System.out.printf("\tMedical Records: \n");
					for(String medicalRecord : patient.getMedicalRecords()) {
						System.out.printf("\t-Visited %s for %s (Cost: %s)\n", doctor.getName(), medicalRecord, Main.formatIDR(doctor.getFee()));
					}
				}
			}
		}
		
		System.out.println();
		
		System.out.printf("Total Hospital Income: %s\n", Main.formatIDR(total));
	}
}
