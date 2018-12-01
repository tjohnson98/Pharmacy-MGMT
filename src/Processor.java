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
	
	
	public static void processorInit() throws IOException {
		readDrugs();    //returns an ArrayList
		readDoctors();
		
		//readPatients();
		//readPrescriptions();
		
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

			temp = new Drug(fields[0], fields[1], fields[2], fields[3]);
			//TODO the rest info

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
			
			//TODO the rest info
			
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

	/*public static ArrayList<Prescriptions> readPrescriptions() throws IOException {             

		String currentLine;	     
		ArrayList<Account> accounts = new ArrayList<>();
		String[] fields;
		Account temp = null;
		Scanner in = new Scanner(new BufferedReader(new FileReader(filePath)));	

		while (in.hasNext()) {

			currentLine = in.nextLine();	         
			fields = currentLine.split(" ");  				


			if (fields[1].equals("C")) { 
				temp = new Checking(Integer.parseInt(fields[0]), fields[2] + " " + fields[3], Double.parseDouble(fields[4]));    
			}
			if (fields[1].equals("S")) {  					
				temp = new Savings(Integer.parseInt(fields[0]), fields[2] + " " + fields[3], Double.parseDouble(fields[4]));
			}


			accounts.add(temp);
		}  
		in.close();

		return accounts;
	}*/
	
	public static void main(String[] args) throws IOException {
		processorInit();
		System.out.println("I compiled!");
		
	}

}
