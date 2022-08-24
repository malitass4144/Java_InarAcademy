package chapters.chapter02;

import java.util.Scanner;

public class ComputerForLoanPayments {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter annual interest rate");
		
		double interestRate = input.nextDouble();
		
		double annualİnterestRate = interestRate/100;
		
		double monthlyİnterestRate = annualİnterestRate/12;
				
		System.out.println("Please enter number of years as an integer ");
		
		int numberOfYears= input.nextInt();

		System.out.println("Please enter the loan amount ");
		
		double loanAmount = input.nextDouble();
		
		//calculate payment
		
		double monthlyPayment = loanAmount* monthlyİnterestRate/(1-1/Math.pow(1+monthlyİnterestRate,numberOfYears*12));
		
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		System.out.println(" the monthly payment is $ "+(int)(monthlyPayment*100)/100.0);
		
		System.out.println("the total payment is $ "+ (int)(totalPayment*100)/100.0 );
		
		
		
		
		

		
		
		

		
	}

}
