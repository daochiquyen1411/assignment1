package fa.training.assignment1;
/*
 * (C) Copyright 2021 Fresher Academy. All rights Reserved. 
 * 
 * @author daoch
 * @date Jun 10, 2021
 * @version 1.0 
 */

import java.util.Scanner;

public class CircleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Radius: ");
		double Radius = scan.nextDouble();
		double c = Math.PI;
		double a, p;
		
		a = c * Radius * Radius;
		p = 2 * c * Radius;
		System.out.println("Perimeter is = " + p);
		System.out.println("Area is = " + a);
	
	    
		/* 	Test case  Radius = 7.5
		    
		   	Expected Output

			Perimeter is = 47.12388980384689

			Area is = 176.71458676442586 */		
	}

}
