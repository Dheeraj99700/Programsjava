package Day5_6;

import java.util.Scanner;

public class Swapno {
	   public static void main(String arr[])   
	    {   
	        System.out.println("Enter the value of x and y");  
	        Scanner sc = new Scanner(System.in);  
	       
	        int x = sc.nextInt();  
	        int y = sc.nextInt();  
	         
	      
	        x = x + y;   
	        y = x - y;   
	        x = x - y;   
	        System.out.println("After swap of numbers the value of x is "+x+" And y is " +y);   
	    }   
	

}
