package apitesting;

import java.util.ArrayList;

public class User {
	private String email;
	private String firstName;
	private String LastName;
	private ArrayList<Integer> mobile;
	private Address address;

	public User(String email,String FirstName,String LastName,String flatNo,String city,String state,String country) {
		this.email=email;
		this.firstName=FirstName;
		this.LastName=LastName;
		this.mobile=new ArrayList<Integer>();
		this.address=new Address(flatNo,city,state,country);		
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfirstName() {
		return firstName;
	}
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName=LastName;
	}
	public ArrayList<Integer> getMobile() {
		return mobile;
	}
	public void setMobile(int... mobileNumbers) {
		for (int i = 0; i < mobileNumbers.length; i++) {
			this.mobile.add(mobileNumbers[i]);
		}
	}

}
