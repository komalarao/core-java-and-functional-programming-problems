package com.bridgelabz_day5Problems;

import java.util.Scanner;

public class Coin {
	public void flipping() {
		
		   float tail = 0;
		   
		   float head = 0;
		   
			Scanner integer = new Scanner (System.in);
			
			System.out.println("enter a number to flip a coin that much times");
			
			int times = integer.nextInt();
			
		
			for ( int i=1;i<=times;i++) {
				
			
			double  turn = (Math.random());
			System.out.println();
			
			
			if (turn<0.5) {
			
			System.out.println("coin flipping.....  it got tail");
			
			
			tail = tail+1;
			}
			else if (turn>0.5){
			
				System.out.println("coin flipping.....  it got head");
				
				head = head+1;
			}
			}
			
			float totalHeadPercentage =(head/(times))*100; 
			
			float totalTailPercentage = (tail/(times))*100;
			
			System.out.println();
			
			System.out.println("coin fliiped for "+times+" times and it got head for "+head+" times");
			
			System.out.println();
			
			System.out.println("coin flipped for "+times+" times and it got tail for "+tail+" times");
			
			System.out.println();
			
			System.out.println("total head percentage in the total flips is "+totalHeadPercentage+"%");
			
			  System.out.println();
			  
			System.out.println("total tail percentage in the total flips is "+totalTailPercentage+"%");	 
			 
		 }
	public static void main(String[] args) {
		new Coin().flipping();
	}
}
