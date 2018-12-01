import java.util.ArrayList;


public class Drug {
	
	private String name;
	private String chemicalName;
	private String Manufacturer;
	private String drugtype;
	private String[] conditions;
	private ArrayList<Drug> contradictions;
	
	public Drug() {

		this.name = "";
		this.chemicalName = "";
		Manufacturer = "";
		this.drugtype = "";
		//this.conditions = new String[];
		//this.contradictions = ;
	}
	
	
	public Drug(String name, String chemicalName, String manufacturer, String drugtype, String[] conditions,
			ArrayList<Drug> contradictions) {

		this.name = name;
		this.chemicalName = chemicalName;
		Manufacturer = manufacturer;
		this.drugtype = drugtype;
		this.conditions = conditions;
		this.contradictions = contradictions;
	}
	//SETTERS AND GETTERS//
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getChemicalName() {
		return chemicalName;
	}
	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getDrugtype() {
		return drugtype;
	}
	public void setDrugtype(String drugtype) {
		this.drugtype = drugtype;
	}
	public String[] getConditions() {
		return conditions;
	}
	public void setConditions(String[] conditions) {
		this.conditions = conditions;
	}
	public ArrayList<Drug> getContradictions() {
		return contradictions;
	}
	public void setContradictions(ArrayList<Drug> contradictions) {
		this.contradictions = contradictions;
	}
	
		//END OF SETTERS AND GETTERS//
		///////////METHODS///////////	
		//TODO--------------------//
	
}
