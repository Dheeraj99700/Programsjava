package Basic1.comparestring;

import java.util.Scanner;

public class Cmpstring {

    public static void main(String[] args) {
    	String A, B = "";
	    Scanner in = new Scanner(System.in);

	    System.out.println("Enter First string Name to Compare");
	    A = in.nextLine();
	    System.out.println("Enter Second  string Name to Compare");
	    B = in.nextLine();
	    if(A.equals(B))
            System.out.println("The input strings are equal");
        else
            System.out.println("The input stings are Not Equal");
    }
}