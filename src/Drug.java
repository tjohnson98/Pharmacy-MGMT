import java.util.ArrayList;


public class Drug {
	
	private String name;
	private String chemicalName;
	private String Manufacturer;
	private String drugtype;
	private ArrayList<String> conditions;
	private ArrayList<String> contradictions;
	
	public Drug() {

		this.name = "";
		this.chemicalName = "";
		Manufacturer = "";
		this.drugtype = "";
		//this.conditions = new String[];
		//this.contradictions = ;
	}
	
	
	public Drug(String name, String chemicalName, String manufacturer, String drugtype, ArrayList<String> conditions,
			ArrayList<String> contradictions) {

		this.name = name;
		this.chemicalName = chemicalName;
		Manufacturer = manufacturer;
		this.drugtype = drugtype;
		this.conditions = conditions;
		this.contradictions = contradictions;
	}
	
	public Drug(String name, String chemicalName, String manufacturer, String drugtype) {

		this.name = name;
		this.chemicalName = chemicalName;
		Manufacturer = manufacturer;
		this.drugtype = drugtype;
		
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
	public ArrayList<String> getConditions() {
		return conditions;
	}
	public void setConditions(ArrayList<String> conditions) {
		this.conditions = conditions;
	}
	public ArrayList<String> getContradictions() {
		return contradictions;
	}
	public void setContradictions(ArrayList<String> contradictions) {
		this.contradictions = contradictions;
	}
	
		//END OF SETTERS AND GETTERS//
		///////////METHODS///////////	
		//TODO--------------------//
	
}
