package fa.training.assignment1;

import java.util.Scanner;

/*
 * (C) Copyright 2021 Fresher Academy. All rights Reserved. 
 * 
 * @author daoch
 * @date Jun 10, 2021
 * @version 1.0 
 */

public class RectangleExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Width: ");
		double Width = scan.nextDouble();
		System.out.print("Input Height: ");
		double Height = scan.nextDouble();
		
		double a ,p;
		a = Width * Height;
		p = 2 * (Width + Height); 
		System.out.println("Area is " + Width +" * " + Height +" = "+ a);
		System.out.println("Perimeter is 2 * (" + Width + " + " + Height + ") = " + p);
		
		/* Test Data:

		 * Width = 5.5 Height = 8.5

		 * Expected Output:

		 * Area is 5.5 * 8.5 = 46.75

		 * Perimeter is 2 * (5.5 + 8.5) = 28.00 */
	}

}
