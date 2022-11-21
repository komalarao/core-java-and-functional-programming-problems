package com.bridgelabz_day5Problems;

import java.util.Scanner;


public class NumberFactors {
void numberFactor() {
		
		int count = 0;
		Scanner numbers = new Scanner(System.in);
		System.out.println("enter any integer:");
		
	    int	number = numbers.nextInt();
	     
	     int factor;
			   for(factor=1;factor<=number/2;factor++) {
				 if(number % factor == 0) {
					System.out.println(factor+ " is a factor to the "+number);
					count = count+1;
				 }
				 
			   }
			   System.out.println( number+" have the "+count+" factors");
	}
public static void main(String[] args) {
	new NumberFactors().numberFactor();
}

}
