
public class Doctors {
	
	private String name;
	private String address;
	private String phone;
	private String specialization;
	private String[][] watchlist;
	
	public Doctors() {
		this.name = "";
		this.address = "";
		this.phone = "";
		this.specialization = "";
		this.watchlist = new String[10][1];
	}
	
	public Doctors(String name, String address, String phone, String specialization, String[][] watchlist) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.specialization = specialization;
		this.watchlist =  new String[10][1];
	}
	
	public Doctors(String name, String address, String phone, String specialization) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.specialization = specialization;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String[][] getWatchlist() {
		return watchlist;
	}
	public void setWatchlist(String[][] watchlist) {
		this.watchlist = watchlist;
	} 
	
	

}
