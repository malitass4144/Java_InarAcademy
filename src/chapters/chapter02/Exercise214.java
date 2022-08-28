package chapters.chapter02;

import java.util.Scanner;

public class Exercise214 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println(" please enter your weight(in kilograms) and your height(in meters): ");
		
		double weight=input.nextDouble();
		
		double height=input.nextDouble();
		
		double ıbm= weight/Math.pow(height,2);
		
		System.out.println(" BMI is; " +(int)(ıbm*100)/100.0);
				
		
		
	}

}
