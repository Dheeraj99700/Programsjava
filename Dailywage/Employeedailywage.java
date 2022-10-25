package Dailywage;

import java.util.Scanner;

public class Employeedailywage {
public void dailywage() {
	Scanner scanner =new Scanner(System.in);

	System.out.println("Enter Per hour wage");
	double Perhour=scanner.nextDouble();
	System.out.println("Enter Total hours of working in a Day");
	double workinghour=scanner.nextDouble(); 
	System.out.println("Enter  overtime time work hours of employee if not mention zero");
	double overtimehour=scanner.nextDouble();
	double dailywage=Perhour*(workinghour+overtimehour);
	 System.out.println("Daily wage is="+dailywage);
}
}
