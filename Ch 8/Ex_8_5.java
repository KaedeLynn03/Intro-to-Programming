/*
Author: Kaede Cunningham
Date: 2/26/19


*/
import java.util.Scanner;

class Untitled {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double oj[][] = new double[3][3];		// Matrix A
		double aj[][] = new double[3][3];		// Matrix B
		double[][] oreos = new double[3][3];	// Matrix C
		// Prompt user for Matrix A 
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for row" + (row + 1) + " for Matrix A: ");
			
			for (int col = 0; col <= 2; col++) {
				oj [row][col] = input.nextDouble();
			}
		}
		// Prompt user for Matrix B 
		for (int row = 0; row < 3; row++) {
			System.out.print("Enter 3 numbers for row" + (row + 1) + " for Matrix b: " );
			
			for (int col = 0; col <= 2; col++) {
				aj[row][col] = input.nextDouble();
			}		
		}	
		
		oreos = addMatrix(oj, aj);
		
		// Count row
		// Print before table
		for (int row = 0; row < oreos.length; row++) {
			// Count columns
			// Print first item on row
			for(int col = 0; col < oreos [0].length; col++) {
				// Print for every table element 
				System.out.print(oreos [row][col] + " " );
			}
			// Print last item on row
			System.out.println();
		}
		// Print after table
	}
	
	public static double [][] addMatrix(double[][] a, double[][] b) {
		
		double[][] c = new double[3][3];
		
		for (int row = 0; row < c.length; row++) {
			for (int col = 0; col < c[0].length; col++) {
				c[row][col] = a[row][col] + b[row][col];
			}
		}
		
		return c;
		
	}
}

