package ru.vorobyov;

public class Reception {
	
	Patient patient;
	private Archive archive;
	private MedicalCard medicalCard;
	private PlanOfClinic planOfClinic;
	
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public void setArchive(Archive archive) {
		this.archive = archive;
	}
	
	public void setMedicalCard() {
		this.medicalCard = archive.getMedicalCard(patient);
	}
	
	public void setPlanOfClinic(PlanOfClinic planOfClinic) {
		this.planOfClinic = planOfClinic;
	}

	public int getRoomNumber(Patient patient) {
		System.out.println("Пациент пришёл");
		return planOfClinic.getRoomNumber(patient.getNeededDoctor());
	}
}
