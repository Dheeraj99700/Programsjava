package Addbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddAddressBookUC1 {
	 ContactsUC2 contact;
	   
	    Scanner scanner =new Scanner(System.in);
	   
	    public void addContact() {
	    	
	        contact=new ContactsUC2();
	        
	        System.out.println("Enter the First name");
	        String firstName=scanner.nextLine();
	       
	        System.out.println("Enter the Last name");
	        String lastName=scanner.nextLine();
	       
	        System.out.println("Enter the City name");
	        String city=scanner.nextLine();
	       
	        System.out.println("Enter the State");
	        String state=scanner.nextLine();
	       
	        System.out.println("Enter the Pin");
	        String pin=scanner.nextLine();
	       
	        System.out.println("Enter the Mobile Number");
	        String mobileNo=scanner.nextLine();
	       
	        System.out.println("Enter the Email Id");
	        String email=scanner.nextLine();
	       
	       
	        contact.setFirstName(firstName);
	        contact.setLastName(lastName);
	        contact.setCity(city);
	        contact.setState(state);
	        contact.setPin(pin);
	        contact.setMobileNumber(mobileNo);
	        contact.setEmail(email);
	       
	       
	        
	       
	    }
	   
	   
	    public void editContacts() {
	        System.out.println("enter the First Name of a person to edit:");
	        String name=scanner.nextLine();
	       
	        if(name.equalsIgnoreCase(contact.getFirstName())) {
	            System.out.println("Do you want to Edit First name ?");
	            System.out.println("Enter Y/N to Edit ");
	            String op=scanner.nextLine();
	           
	            if(op.equals("y") || op.equals("Y")) {
	                System.out.println("Enter the First name");
	                String firstName=scanner.nextLine();
	                contact=null;
	               
	            }
	            else
	                    contact.setFirstName(contact.getFirstName());
	        addContact();
	        }else
	            System.out.println("Invalid First Name \n Please enter Valid First name: ");
	            editContacts();
	    }
	            
	            public void displaycontact()
	            {
	            	System.out.print(contact);
	            }


	    public void deletecontact()
	    {
	    	System.out.println("enter the First Name of a person to Delete:");
	        String name=scanner.nextLine();
                contact=null;
                System.out.println("Contact is Deleted");
	    }
	
		        
		 
	 }
	   
	    	
	    


