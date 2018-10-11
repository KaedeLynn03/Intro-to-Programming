/*
Author: Kaede Cunningham
Date: 10/3/18

This will Convert Celsius to Fahrenheit
*/

import java.util.Scanner;

class Ex_2_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double celsius = 0.0;
		double fahrenheit = 0.0;
		
		System.out.println("Converting Celcius to Fahrenheit");
		
		System.out.println("Enter the Celsius Value");
		celsius = input.nextDouble();
		
		fahrenheit = (9.0/5) * celsius + 32;
		
		System.out.println("The Fahreinheit degrees is");
		System.out.println(fahrenheit);
	}	
}