package ru.vorobyov;

public class Reception {
	
	Patient patient;
	private Archive archive;
	private MedicalCard medicalCard;
	private PlanOfClinic planOfClinic;
	
	public void setArchive() {
		this.archive = new Archive();
	}
	
	public void setMedicalCard() {
		this.medicalCard = Archive.getMedicalCard(patient);;
	}
	
	public void setPlanOfClinic() {
		this.planOfClinic = new PlanOfClinic();
	}
	
	public Reception(Patient patient, Archive archive, PlanOfClinic planOfClinic) {
		this.patient = patient;
		this.archive = archive;
		this.planOfClinic = planOfClinic;
	}
	
	public int getRoomNumber(Patient patient) {
//		this.patient = patient;
		System.out.println("Пациент пришёл");
//		medicalCard = Archive.getMedicalCard(patient);
//		planOfClinic = new PlanOfClinic();
		
		return planOfClinic.getRoomNumber(patient.getNeededDoctor());
	}
}
