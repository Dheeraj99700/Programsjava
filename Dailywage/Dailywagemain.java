package Dailywage;

import java.util.Random;
import java.util.Scanner;

public class Dailywagemain {
	public static void main(String[] args) {

		
		Employeeabsentorpresent employeeattendence = new Employeeabsentorpresent();
		Employeedailywage employeedailywage = new Employeedailywage();
		Employeemonthwage employeemonthlywage = new Employeemonthwage();
		Employeedayhourwage employeedayhourwage=new Employeedayhourwage();
		try (Scanner sc = new Scanner(System.in)) {
			int variable;
			System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
			System.out.println("Please enter the Number for following details\r\n" + "1.Employee Absent Or Present\r\n"
					+ "2.Employee Daily Wage\r\n" + "3.Employee wage for a month\r\n"
					+ "4.Employee wage for a month with hours and days\r\n");

			variable = sc.nextInt();
			switch (variable) {
			case 1:
				employeeattendence.absentorpresent();
				break;

			case 2:
				employeedailywage.dailywage();
				break;
			case 3:
				employeemonthlywage.monthlywage();

				break;
			case 4:
                employeedayhourwage.dayhour();
				break;

			default:
				System.out.println("The value of the variable is neither 1 nor 2 nor 3 nor 4");
			}
		}

	}
}
