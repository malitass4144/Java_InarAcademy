package chapters.chapter02;

import java.util.Scanner;

public class Exercise025 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Please enter subtotal; ");
	
		double subtotal=input.nextDouble();
		
		System.out.println(" Please enter gratuity rate ; ");

		double gratuityRate=input.nextDouble();
		
		double gratuity =(gratuityRate /100.0)*subtotal;
		
		double total = gratuity*subtotal;
		
		System.out.println(" the gratuity is "+ gratuity+"$ and total is ; " + total);
		
		
	
	
	
	
	
	}

}
