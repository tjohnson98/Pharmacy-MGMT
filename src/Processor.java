import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
	
	final static String DRUG_FILEPATH = "drug.txt";
	final static String DOCTOR_FILEPATH = "doctors.txt" ;
	final static String PATIENT_FILEPATH = "patient.txt";
	final static String PRESCRIPTION_FILEPATH = "prescription.txt";	
	
	static ArrayList<Drug> drugs;
	static ArrayList<Doctors> doctors;
	static ArrayList<Patients> patients;
	static ArrayList<Prescriptions> prescriptions;
	
	
	public static void processorInit() throws IOException {
		drugs = readDrugs();    
		doctors = readDoctors();		
		patients = readPatients();
		prescriptions = readPrescriptions();
		
	}	
	
	public static ArrayList<Drug> readDrugs() throws IOException {             

		String currentLine;	     
		ArrayList<Drug> drugs = new ArrayList<>();
		String[] fields;
		
		Drug temp = null;
		Scanner in = new Scanner(new BufferedReader(new FileReader(DRUG_FILEPATH)));	

		while (in.hasNext()) {

			currentLine = in.nextLine();	         
			fields = currentLine.split(" "); 
			ArrayList<String> conditions = new ArrayList<>();
			ArrayList<String> contradictions = new ArrayList<>();

			temp = new Drug(fields[0], fields[1], fields[2], fields[3]);
			
			for(int i = 0; i < fields.length; i++) {                         //SET CONDITIONS 
				if(fields[i].charAt(0) == ':') {
				 conditions.add(fields[i].substring(1));
				}
			temp.setConditions(conditions);	
			
			}
			
			for(int i = 0; i < fields.length; i++) {                         //SET CONTRADICTIONS 
				if(fields[i].charAt(0) == '?') {
				 contradictions.add(fields[i].substring(1));
				}
			temp.setContradictions(contradictions);	
			
			}

			drugs.add(temp);
		}  
		in.close();

		return drugs;
	}

	public static ArrayList<Doctors> readDoctors() throws IOException {             

		String currentLine;	     
		ArrayList<Doctors> doctors = new ArrayList<>();
		String[] fields;
		Doctors temp = null;
		Scanner in = new Scanner(new BufferedReader(new FileReader(DOCTOR_FILEPATH)));	

		while (in.hasNext()) {

			currentLine = in.nextLine();	         
			fields = currentLine.split(" ");  				

			temp = new Doctors(fields[0] + " " + fields[1], fields[2] + " " + fields[3] + " " + fields[4],
					fields[5], fields[6]);   
			
			doctors.add(temp);
		}  
		in.close();

		return doctors;
	}

	public static ArrayList<Patients> readPatients() throws IOException {             

		String currentLine;	     
		ArrayList<Patients> patients = new ArrayList<>();
		String[] fields;
		Patients temp = null;
		Scanner in = new Scanner(new BufferedReader(new FileReader(PATIENT_FILEPATH)));	

		while (in.hasNext()) {

			currentLine = in.nextLine();	         
			fields = currentLine.split(" ");  				

			temp = new Patients(fields[0] + " " + fields[1], fields[2], fields[3] + " " + fields[4] + " " + fields[5],
					fields[6], fields[7]);    

			patients.add(temp);
		}  
		in.close();

		return patients;
	}

	public static ArrayList<Prescriptions> readPrescriptions() throws IOException {             

		String currentLine;	     
		ArrayList<Prescriptions> prescriptions = new ArrayList<>();
		String[] fields;
		Prescriptions temp = null;
		Scanner in = new Scanner(new BufferedReader(new FileReader(PRESCRIPTION_FILEPATH)));	

		while (in.hasNext()) {

			currentLine = in.nextLine();	         
			fields = currentLine.split(" ");  				

			temp = new Prescriptions (fields[0], fields[1]); 
			//TODO everything else
		
			prescriptions.add(temp);
		}  
		in.close();

		return prescriptions;
	}
	
	public static void main(String[] args) throws IOException {
		processorInit();
		System.out.println("I compiled!");
		
		
		
		//TESTING
		for(int i = 0; i < drugs.size(); i++ ) {
			System.out.println(drugs.get(i).getName());
			System.out.println(drugs.get(i).getConditions().get(0));
			System.out.println(drugs.get(i).getContradictions().get(0));
		}
		
		
/*		for(int i = 0; i < patients.size(); i++ ) {
			System.out.println(patients.get(i).getName());
		}
		
		for(int i = 0; i < doctors.size(); i++ ) {
			System.out.println(doctors.get(i).getName());
		}
		
		for(int i = 0; i < prescriptions.size(); i++ ) {
			System.out.println(prescriptions.get(i).getId());
		}*/
		
	}

}
