package Dailywage;

import java.util.Scanner;

public class Employeedayhourwage {
	public void dayhour() {
		Scanner scanner =new Scanner(System.in);
	System.out.println("Enter number of days Employee worked");
	double Daysworked =scanner.nextDouble();
	System.out.println("Enter Hours  Employee worked ");
	double Hoursworked=scanner.nextDouble();
	if (Daysworked>=20 && Hoursworked>=100)
	{
		System.out.println("Enter wage per hour ");
		double Hourlywage=scanner.nextDouble();
		double Totalwage=Hourlywage*Hoursworked;
		System.out.println("Total Wage of employee fulfilled criteria"+Totalwage);
	}
	else
	{
	System.out.println("The employee couldn't fulfill the criteria");
	}

	}
}
