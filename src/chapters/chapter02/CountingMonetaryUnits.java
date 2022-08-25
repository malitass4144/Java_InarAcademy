package chapters.chapter02;

import java.util.Scanner;

public class CountingMonetaryUnits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the amount that you want to exchange");
		
		double amount=input.nextDouble();
		
	    double cents = amount*100;
		
		int dollars = (int)cents/100;
		
		int remainingCentsFromDollars=(int)cents%100;
		
		int quarters =remainingCentsFromDollars/25;
		
		int remainingCentsFromQuarters=remainingCentsFromDollars%25;
		
		int dims = remainingCentsFromQuarters/10;
		
		int remainingCentsFromDims=remainingCentsFromQuarters%10;
		
		int nickels=remainingCentsFromDims/5;
		
		int remainingCentsFromNickels=remainingCentsFromDims%5;
		
		System.out.println(amount +"$ is : " + dollars+"$ and " + quarters+" quarters and "+dims+" dims and "+nickels+ " nickels and "+
		remainingCentsFromNickels+" cents.");
		
		
		
		
		
		
		
		
	
		
		
		
	}

}
