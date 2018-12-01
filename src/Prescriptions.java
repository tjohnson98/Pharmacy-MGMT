import java.util.ArrayList;

public class Prescriptions {
	private String id;
	private String dateIssued;
	private Doctors doctor;
	private Patients patient;
	private ArrayList<Druglines> drugLines;
	

	public Prescriptions(String id, String dateIssued, String doctor, ArrayList<Druglines> drugLines) {
		this.id = id;
		this.dateIssued = dateIssued;
		this.drugLines = drugLines;
	}
	
	public Prescriptions(String id, String dateIssued) {
		this.id = id;
		this.dateIssued = dateIssued;
		
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getDateIssued() {
		return dateIssued;
	}


	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}

	/**
	 * @return the doctor
	 */
	public Doctors getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(Doctors doctor) {
		this.doctor = doctor;
	}

	/**
	 * @return the drugLines
	 */
	public ArrayList<Druglines> getDrugLines() {
		return drugLines;
	}

	/**
	 * @param drugLines the drugLines to set
	 */
	public void setDrugLines(ArrayList<Druglines> drugLines) {
		this.drugLines = drugLines;
	}

	public Patients getPatient() {
		return patient;
	}

	public void setPatient(Patients patient) {
		this.patient = patient;
	}
	
	
}
