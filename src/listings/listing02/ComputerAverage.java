package listings.listing02;

import java.util.Scanner;

public class ComputerAverage {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Please enter three numbers :");
		//we wanted three numbers to compute their averages
		
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		double average = (number1+number2+number3)/3;
		
		System.out.println("The average of "+ number1+" "+ number2 +" "+number3+" is "+ average);

	}

}
