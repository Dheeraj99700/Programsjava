package Day2;

import java.util.Scanner;

public class Displayunit {
	public static void main (String[] args) {
		int A;
		System.out.println("Enter the  number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		A=x%100;
		 if (A == 0)
		 {
			 System.out.println("The number is divisible of 100");
		 }
		 else
		 {
			 System.out.println("The number is not divisible of 100");
		 }
	}

}
