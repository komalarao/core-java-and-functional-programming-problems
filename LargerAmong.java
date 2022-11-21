package com.bridgelabz_day5Problems;

import java.util.Scanner;


public class LargerAmong {
	void checkLarge () {
   	 
   	 Scanner first = new Scanner(System.in);
   	 System.out.println("please enter a number");
   	 int firstNumber = first.nextInt();
   	 
   	 Scanner second = new Scanner(System.in);
   	 System.out.println("please enter second number");
   	 int secondNumber = second.nextInt();
   	 
   	 Scanner third = new Scanner(System.in);
   	 System.out.println("please enter third number");
   	 int thirdNumber= third.nextInt();
   	 
   	 if (firstNumber>secondNumber && firstNumber>thirdNumber) {
   		 
   		 System.out.println(firstNumber+" is the larger number");
   		 
   	 }else if(secondNumber>firstNumber && secondNumber>thirdNumber) {
   	     System.out.println(secondNumber+" is greater number");
    }else {
   	 System.out.println(thirdNumber+" is greater number");
    }
}public static void main(String[] args) {
	new LargerAmong().checkLarge();
}
}
