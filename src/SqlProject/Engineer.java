package SqlProject;

import java.util.*;

public class Engineer {
	
	private int id;
	
	private String fullname;


	private int age;
	
	private String birthdate;
	
	private String address;
	
	private ArrayList<String> phone;
	
	
	public Engineer(){
		
	}
	public Engineer(int _id,String _fullname,int _age,String _birthdate,String _address,ArrayList<String> _phone){
	
		this.id=_id;
		this.fullname=_fullname;
		this.age=_age;
		this.birthdate=_birthdate;
		this.address=_address;
		this.phone=_phone;
		}

	public String getBirthDate() {
		return birthdate;
	}
	public void setgetBirthDate(String _birthdate) {
		this.birthdate = _birthdate;
	}
	
	public String getFullname() {
		return fullname;
	}
	public void setFullName(String _fullname) {
		this.fullname = _fullname;
	}

	public int getId() {
		return id;
	}
	public void setId(int _id) {
		this.id = _id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String _Address) {
		this.address = _Address;
	}
	public ArrayList<String> getphone() {
		    return phone;
		  }
	public void setphone(ArrayList<String> _phone) {
		  this.phone = _phone;
		}
	
}
