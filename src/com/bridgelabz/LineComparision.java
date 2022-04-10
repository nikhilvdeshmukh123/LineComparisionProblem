package com.bridgelabz;
//@author : Nikhil
import java.util.Scanner;		// Needed to use the Scanner

public class LineComparision {
	static Scanner scan = new Scanner(System.in);
	// Declare variables
	int x1;
	int y1;
	int x2;
	int y2;
	
	public void enterCoordinatesValues(){

		System.out.println("Enter the Coordinates");	// Show prompting message
		x1 = scan.nextInt();							// Use nextInt() to read an int
		System.out.println("Enter the Coordinates");
		y1 = scan.nextInt();
		System.out.println("Enter the Coordinates");
		x2 = scan.nextInt();
		System.out.println("Enter the Coordinates");
		y2 = scan.nextInt();	
		System.out.print("Length of Line: " + calculateLength());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Welcome to line comparision");			// Show prompting message
		LineComparision lineComparison1 = new LineComparision();
		lineComparison1.enterCoordinatesValues();
	}
	public double calculateLength(){
		//Computation
		double length = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2)); 
			return length;
	}
}