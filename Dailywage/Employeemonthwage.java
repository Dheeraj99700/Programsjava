package Dailywage;

import java.util.Scanner;

public class Employeemonthwage {
public void monthlywage() {
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter Total Number of workings days wage");
	double Workingdays=scanner.nextDouble();
	System.out.println("Enter salary per day");
	double Dailysalary=scanner.nextDouble(); 
	double dailynwage=Workingdays*Dailysalary;
	 System.out.println("Monthly wage is="+dailynwage);
}
}
