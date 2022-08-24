package listings.listing02;

import java.util.Scanner;

public class Listing028 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Please enter purchase amount"); 
		
		double purchaseAmount =input.nextDouble();
		
		Scanner input1 = new Scanner(System.in);

		
		System.out.println(" please enter tax rate ");
		
		double taxRate =input1.nextDouble();
		
		double tax =taxRate*purchaseAmount;
		
		System.out.println(" Sales tax is $" +(int)(tax *100)/100.0);
	}

}
