import java.util.ArrayList;

public class Prescriptions {
	private String id;
	private String dateIssued;
	private Doctors doctor;
	private ArrayList<Druglines> drugLines;
	
	/**
	 * @param id
	 * @param dateIssued
	 * @param doctor
	 * @param drugLines
	 */
	public Prescriptions(String id, String dateIssued, String doctor, ArrayList<Druglines> drugLines) {
		this.id = id;
		this.dateIssued = dateIssued;
		//this.doctor = doctor;
		this.drugLines = drugLines;
	}
	
	public Prescriptions(String id, String dateIssued) {
		this.id = id;
		this.dateIssued = dateIssued;
		
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the dateIssued
	 */
	public String getDateIssued() {
		return dateIssued;
	}

	/**
	 * @param dateIssued the dateIssued to set
	 */
	public void setDateIssued(String dateIssued) {
		this.dateIssued = dateIssued;
	}

	/**
	 * @return the doctor
	 */
	public String getDoctor() {
		return doctor;
	}

	/**
	 * @param doctor the doctor to set
	 */
	public void setDoctor(String doctor) {
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
	
	
}
