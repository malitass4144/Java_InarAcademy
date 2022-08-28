package chapters.chapter02;

import java.util.Scanner;

public class Exercise210 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilograms:");
		
		System.out.println("Enter the initial temperature:");

		System.out.println("Enter the final temperature:");
		
		double amount=input.nextDouble();
		
		double initialTemperature=input.nextDouble();
		
		double finalTemperature=input.nextDouble();
		
		double energyNeeded=amount*(finalTemperature-initialTemperature)*4184;
		
		System.out.println(" The energy needed is ; " +energyNeeded);
		
		

		
		
		
		
	}			

}
