package Addbook;

import java.util.ArrayList;

public class ContactsUC2 {
	 private String firstName;
	    private String lastName;
	    private String city;
	    private String state;
	    private String pin;
	    private String mobileNumber;
	    private String email;
	    
	    @Override
	   
	    public String toString() {
	        return "Contacts [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", state=" + state
	                + ", pin=" + pin + ", mobileNumber=" + mobileNumber + ", email=" + email + "]";
	    }
	    public String getFirstName() {
	        return firstName;
	    }
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    public String getLastName() {
	        return lastName;
	    }
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    public String getCity() {
	        return city;
	    }
	    public void setCity(String city) {
	        this.city = city;
	    }
	    public String getState() {
	        return state;
	    }
	    public void setState(String state) {
	        this.state = state;
	    }
	    public String getPin() {
	        return pin;
	    }
	    public void setPin(String pin) {
	        this.pin = pin;
	    }
	    public String getMobileNumber() {
	        return mobileNumber;
	    }
	    public void setMobileNumber(String mobileNumber) {
	        this.mobileNumber = mobileNumber;
	    }
	    public String getEmail() {
	        return email;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	   
	   
	    public ContactsUC2() {
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.city = city;
	        this.state = state;
	        this.pin = pin;
	        this.mobileNumber = mobileNumber;
	        this.email = email;
	    }
	   

	}



