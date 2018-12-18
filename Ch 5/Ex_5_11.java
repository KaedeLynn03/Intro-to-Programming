/*
Author: Kaede Cunningham
Date:12/18/18
Finding numbers divisible by 5 and 6
*/

class Ex_5_11 {
	public static void main(String[] args) {
		
		int j = 0;
		
		System.out.println("Numbers that are divisable by 5 or 6");
		
		for (int i = 100; i <= 200; i++) {
			if ((i % 5 == 0) ^ (1 % 6 ==0)) {
				System.out.print(i + " ");
				j++;
				if (j == 10) {
					System.out.println(" ");
					j = 0;
					
				}
			
			}	

	    }	
	}
}