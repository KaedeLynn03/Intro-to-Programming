/*
Author: Kaede Cunningham
Date: 12/14/18

*/
import java.util.Scanner;

class Ex_6_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user = 0;
		int num = 0;
		int remain = 0;
		int reverse = 0;
		
		// Prompt user 
		System.out.print("Enter a number: ");
		user = input.nextInt();
		
		
		// Copy user to a mutable variable 
		num = user;
		while (num != 0) {
			remian = num % 10;
			reverse = (reverse * 10) + remain; 
			num /= 10;
		}
		
		if (user == reverse) {
			System.out.println(user + "is a Palendrome");
		}
		else{
			System.out.println(user + "is not a Palendrome");
		}
	}
}