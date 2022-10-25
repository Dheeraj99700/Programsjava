package SnakeandLadder;

import java.util.Random;

public class Prog {
	

	public static void main(String[] args) {
		 String[] at= { "1","2","3","4","5","6" };
		  Random rand = new Random();
	      int res = rand.nextInt(at.length);
	      int playerA;
	      int count=0;
	     
		playerA = 0;
		System.out.println("The First time number you got from dice is " + at[res]);
		playerA = playerA + res + 1 ;
		{
		System.out.println("From the first block player1 has moved to block  " + playerA);
		}
	     
		
		
		while(playerA<100)   
		   {
	    	 String[] nw= { "1","2","3","4","5","6" };
			  Random b = new Random();
		      int aes = b.nextInt(at.length);
	    	 String[] SL= { "Snake","Ladder"};
				 
				Random n = new Random();
			      int r= n.nextInt(at.length);	
		      if(r == 0)
		      {
		    	  playerA=playerA-res;
		      }   
		      else
		      {
		    	  playerA=playerA+res;
		      }
		      count++;
		   }
		   
		   System.out.println("You count of rolling dice to win this game is " +count);
	
	System.out.println("Thanks for playing and Winning the game");
	}
	
}