package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private String Name;
	private String email;
	private Date bihDate;
	
	SimpleDateFormat sdf = new SimpleDateFormat();
	
	public Client(String name, String email, Date bihDate) {
		this.Name = name;
		this.email = email;
		this.bihDate = bihDate;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBihDate() {
		return bihDate;
	}
	public void setBihDate(Date bihDate) {
		this.bihDate = bihDate;
	}
	@Override
	public String toString() {
		return "Client :" + Name + "(" + sdf.format(bihDate)+ ") " + "- " + email;
	}
	
	
	
	
}
