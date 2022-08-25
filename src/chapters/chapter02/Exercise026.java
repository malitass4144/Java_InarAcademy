package chapters.chapter02;

import java.util.Scanner;

public class Exercise026 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	
		//we wanted from user to enter a integer to compute sum of its digits
		
	System.out.println(" Please enter a integer between 0-1000, (ex;956); ");
	
	int integer =input.nextInt();
	
	int firstDigit=integer%10;
	
	int secondDigit=(integer/10)%10;
	
	int thirdDigit =(integer/100);
	
	int sumOfDigits = firstDigit+secondDigit+thirdDigit;
	
	System.out.println(" The sum of the digits is ; " + sumOfDigits );
	
	
	
	
	
	
	
	
	}

}
