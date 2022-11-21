package com.bridgelabz_day5Problems;


public class FindingQuotientAndRemainder {
	
	void findingQuotient() {
		
    	int a = 8;
    	int b = 9;
    	int quotient = (b/a);
    	
    	System.out.println("quotient of the operation is "+quotient);
    	
    }void findingRemainder(){
    	int a = 22;
    	int b = 24;
    	int remainder = (b%a);
    	
    	System.out.println("remainder of the operation is "+remainder);
    }
    public static void main(String[] args) {
    	
    	new FindingQuotientAndRemainder().findingQuotient();
    	new FindingQuotientAndRemainder().findingRemainder();
    }

}
