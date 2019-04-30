/*
Author: Kaede Cunningham

project: Dice Roller
*/

import java.util.Scanner;
class DiceRoller {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double dice, sides;
		
		System.out.print("Enter the number of dice desired: ");
		dice = input.nextDouble();
		
		System.out.print("Enter the number of sides desired on dice: ");
		sides = input.nextDouble();
		
		int number = (int)(Math.random() * (sides + 1));
		System.out.print("Your numbers are:" + number);
	}
}