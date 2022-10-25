package prac;

import java.util.*;

public class stringpalimdrome {
public static void main (String[] args) {
	  String str, tempstring = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Enter a string:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         tempstring = tempstring + str.charAt(i);
      System.out.println("new string is "+tempstring);
 
      if (str.equals(tempstring))
         System.out.println(str+" is a palindrome");
      else
         System.out.println(str+" is not a palindrome");
	
}
}
