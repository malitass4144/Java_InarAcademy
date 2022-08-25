package chapters.chapter02;

import java.util.Scanner;

public class Exercise023 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
				
				System.out.println(" Please enter a number in feet you want to convert it to meters;");
		
		double feet = input.nextDouble();
		
		
		double meters= feet*0.305;
		
		System.out.println(feet +" feet is ; " +meters+" meters.");
		
		
	}

}
