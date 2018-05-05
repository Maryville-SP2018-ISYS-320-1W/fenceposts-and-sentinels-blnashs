/*
	ISYS 320
	Name(s):
	Date: 
*/

import java.util.Scanner;

public class P1_FindMinAndMax {

	public static void main(String[] args) {
        Scanner console = new Scanner( System.in );
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        do {//do while loop
        	System.out.println("Please enter integer");;
        	int number = console.nextInt();
        	int result = -1; // set to -1 to make sure we enter the loop
        	int count = 0;
        	try {//exception handling
        	
        	} catch (Exception e) {
        		System.out.println("your input was -1");;
        	}
        

        // YOUR CODE ENDS HERE
        
        System.out.println( "Maximum was " + max );
        System.out.println( "Minimum was " + min );
    }

}}
