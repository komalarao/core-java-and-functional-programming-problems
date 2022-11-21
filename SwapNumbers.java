package com.bridgelabz_day5Problems;

import java.util.Scanner;

public class SwapNumbers {
     void swapping() {
    	 
    	 Scanner first = new Scanner(System.in);
    	 System.out.println("please enter a number:");
    	 int firstNumber = first.nextInt();
    	 
    	 Scanner second = new Scanner(System.in);
    	 System.out.println("please enter another number:");
    	 int secondNumber = second.nextInt();
    	 
    	 firstNumber = firstNumber+secondNumber;
    	 secondNumber = firstNumber - secondNumber;
    	 firstNumber = firstNumber - secondNumber;
    	 
    	 System.out.println("first number value after swapping  "+firstNumber);
    	 
    	 System.out.println();
    	 
    	 System.out.println("second number value after swapping "+secondNumber);
    	 
     }
     public static void main (String[] args) {
    	 new SwapNumbers().swapping();
     }
}
