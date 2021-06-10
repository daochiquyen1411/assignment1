package fa.training.assignment1;

import java.util.Scanner;

/*
 * (C) Copyright 2021 Fresher Academy. All rights Reserved. 
 * 
 * @author daoch
 * @date Jun 10, 2021
 * @version 1.0 
 */

public class ArithmeticExercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);		
	    System.out.print("Input the first number: ");
	    int a = scan.nextInt();
	    System.out.print("Input the second number: ");
	    int b = scan.nextInt();
		int c ;
		c = a + b;
		System.out.println(c);
		c = a - b;
		System.out.println(c);
		c = a * b;
		System.out.println(c);
		c = a / b;
		System.out.println(c);
		c = a % b;
		System.out.println(c);
		
		/* test case: Input first number: 125

	     Input second number: 24
	    
	    Expected Output:

	    	125 + 24 = 149

	    	125 - 24 = 101

	    	125 x 24 = 3000

	    	125 / 24 = 5

	    	125 % 24 = 5 */
	}

}
