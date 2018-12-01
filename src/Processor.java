import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
	
	final String drugFilePath = "drug.txt";
	final String doctorFilePath = "doctor.txt" ;
	final String patientFilePath = "patient.txt";
	final String prescriptionFilePath = "prescription.txt";
	
	
	public static void processorInit() throws IOException {
		readDrugs();
		readDoctors();
		readPatients();
		readPrescriptions();
		
	}	
	
	public static ArrayList<Drug> readDrugs() throws IOException {             

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
	}

	public static ArrayList<Doctors> readDoctors() throws IOException {             

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
	}

	public static ArrayList<Patients> readPatients() throws IOException {             

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
	}

	public static ArrayList<Prescriptions> readPrescriptions() throws IOException {             

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
	}
	
	public static void main(String[] args) throws IOException {
		processorInit();
		
	}

}
