package chapters.chapter02;

import java.util.Scanner;

public class Exercise221 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Enter investment amount: ");
		
		double investment=input.nextDouble();
		
		System.out.println(" Enter annual interest rate in percentage: ");
		
		double annualInterestRate=input.nextDouble();
		
		double monthlyInterestRate=annualInterestRate/1200;
		
		System.out.println( " Enter number of years: ");
		
		double year=input.nextDouble();
		
		double accumulatedValue=investment*Math.pow(1+monthlyInterestRate,year*12);
		
		System.out.println(" Accumulated value is: "+(int)(accumulatedValue*1000)/1000.0);
		
		
	}

}
