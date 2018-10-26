/*
Author: Kaede Cunningham
Date: 10/26/18

*/
import java.util.Scanner;

class Ex_4_17 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a year:");
		int year = input.nextInt();
		System.out.print("Enter a month, only 3 letters please uppercase the first letter:");
		String month = input.next();
		
		if (month is Jan or month is Mar or month is May or month is Dec) {
			System.out.print("That month has 31 days");
			
		}
		else if (month is Apr or month is Jun or month is Sep or month is Nov){
			System.out.print("That montht has 30 days");
		}
		else if (month is Feb){
			if (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
		}
	}
}