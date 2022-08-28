package chapters.chapter02;

import java.util.Scanner;

public class Exercise213 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println(" Enter the monthly saving amount: ");
		
		double savingAmount =input.nextDouble();
		
		double monthlyInterestRate = 0.00417;
		
		double firstMonth= savingAmount*(1+monthlyInterestRate);
		
		double secondMonth=savingAmount+firstMonth*(1+monthlyInterestRate);
		
		double thirdMonth=savingAmount+secondMonth*(1+monthlyInterestRate);
		
		double fourthMonth=savingAmount+thirdMonth*(1+monthlyInterestRate);
		
		double fifthMonth=savingAmount+fourthMonth*(1+monthlyInterestRate);
		
		double sixthMonth=savingAmount+fifthMonth*(1+monthlyInterestRate);
		
		System.out.println(" After the sixth month, the account value is; " + (int)(sixthMonth*100)/100.0);
		
		
		

	}

}
