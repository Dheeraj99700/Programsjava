package Addbook;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to Address Book System!...");
		AddAddressBookUC1 addressBook = new AddAddressBookUC1();
	
		boolean A=true;
		while(A){
			System.out.println("Select The option to perform operation given below\r\n" + "1.Display Contact \r\n"
					+"2.Edit Contact \r\n" + "3.Add New Contact\r\n" + "4.Delete Contact");
			int op = sc.nextInt();

			switch (op){
			case 1:
				addressBook.displaycontact();
				break;
			case 2:
				addressBook.editContacts();
			case 3:
				addressBook.addContact();
				break;
			case 4:
				addressBook.deletecontact();
				break;
			default:
				A=false;
				break;
			}

		}

	}

}
