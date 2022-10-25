package Day5_6;

import java.util.Scanner;

public class Largestno {
	   public static void main(String a[])   
	    {   
	        System.out.println("Enter the value of x,y and z");  
	        Scanner sc = new Scanner(System.in);  
	         
	        int x = sc.nextInt();  
	        int y = sc.nextInt();
	        int z = sc.nextInt();
	        System.out.println("The values given by user for \r\nX:"+x+"\r\ny:"+y+"\r\nz:"+z);  
	        if (x > y && x > z)	
	        {
	        	if (y > z)
	        	{
	        		System.out.println("Y is the 2nd largest number "+y);
	        	}
	        	  else
	  	        {
	  	        	System.out.println("Z is the 2nd largest number "+z);	
	  	        }
	        	
	        }
	        else if(y > x && y > z)
	        {
	        	if (x > z)
	        	{
	        		System.out.println("X is the 2nd largest number "+x);	
	        	}
	        	 else
		  	        {
		  	        	System.out.println("Z is the 2nd largest number "+z);	
		  	        }
	        	
	        }
	        else if (x > y)
	        {
	        	System.out.println("X is the 2nd largest number "+x);
	        }
	        else
	        {
	        	System.out.println("Y is the 2nd largest number "+y);
	        }
	    }   

}
