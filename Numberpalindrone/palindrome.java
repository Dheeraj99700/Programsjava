package Day2;

import java.util.Scanner;

public class palindrome {
	public static void main(String args[]){  
		  int r,sum=0,temp;    
		  
		  System.out.println("Enter the number you want to reverse");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt(); 
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("The value entered is a palindrome ");    
		  else    
		   System.out.println("The value entered is not a palindrome");    
}
}
