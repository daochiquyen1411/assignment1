package fa.training.assignment1;

import java.util.Scanner;

/*
 * (C) Copyright 2021 Fresher Academy. All rights Reserved. 
 * 
 * @author daoch
 * @date Jun 10, 2021
 * @version 1.0 
 */

public class LogicalExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input first integer: ");
		int a = scan.nextInt();
		System.out.print("Input second integer: ");
		int b = scan.nextInt();
		
		if (a == b) {
			System.out.println(a + " = " + b); 
		}
		else {
			System.out.println(a + " != " + b);
		} 
		
		if (a < b) {
			System.out.println(a + " < " + b);
			System.out.println(a + " <= " + b);
		}else  {
			System.out.println(a + " > " + b);
			System.out.println(a + " >= " + b);
		}
		/* Input Data:

		 * Input first integer: 25

		 * Input second integer: 39

		 * Expected Output:

		 * 25 != 39                                                                         

		 * 25 < 39                                                                           

		 * 25 <= 39

		 */
	}

}
