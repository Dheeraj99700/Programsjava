package Dailywage;

import java.util.Random;

public class Employeeabsentorpresent {
public void absentorpresent() {
	 String[] at= { "Present", "Absent" };
     Random rand = new Random();
	 int res = rand.nextInt(at.length);
	 System.out.println("The Employee is " + at[res]);
}
}
