package com.bridgelabz;

import java.util.Scanner;

public class LineComparison {
	/**
	 * UC-3 - Taking coordinates for two lines as user input and
	 * calculating the length of lines and comparing the two lines 
	 * 
	 */
	
		static double coordinates() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first co-ordinate for x-axis:");
		int x1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for x-axis:");
		int x2 = sc.nextInt();
		System.out.println("Enter the first co-ordinate for y-axis:");
		int y1 = sc.nextInt();
		System.out.println("Enter the second co-ordinate for y-axis:");
		int y2 = sc.nextInt();
		double lengthOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		return lengthOfLine;
		

	}
		/**
		 * This method is displaying the length
		 * of both lines and checking the equality of lines as well
		 */
		public static void length() {
			double line1 = coordinates();
			String s1 = Double.toString(line1);
			double line2 = coordinates();
			String s2 = Double.toString(line2);
			System.out.println("Length of Line 1 : "+s1);
			System.out.println("Length of Line 1 : "+s2);
			if (s1.equals(s2))
				System.out.println("Both lines are of same length");
			else
				System.out.println("Both the lines are of different length");

		}
		
		/**
		 * This method is comparing the lines and 
		 * displaying the greater line/
		 */
		
		static void compareLength() {
			double line1 = coordinates();
			String s1 = Double.toString(line1);
			double line2 = coordinates();
			String s2 = Double.toString(line2);
			System.out.println("Length of Line 1 : "+s1);
			System.out.println("Length of Line 2 : "+s2);

				if (s1.compareTo(s2) < 0) {
				System.out.println(s1 + " is less than the " + s2);
				
			} else {
				System.out.println(s1 + " is greater than the " + s2);
				
			}
		}


	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program");
		
		compareLength();

	}

}
