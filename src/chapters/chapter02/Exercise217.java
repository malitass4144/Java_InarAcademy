package chapters.chapter02;

import java.util.Scanner;

public class Exercise217 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println(" Enter the temperature in Fahrenheit between -58°F and 41°F: ");
		
		double fahrenheit=input.nextDouble();
		
		System.out.println(" Enter the wind speed (>=2) in miles per hour: ");
		
		double windSpeed=input.nextDouble();
		
		double windChill=35.74+(0.6215*fahrenheit)-(35.75*Math.pow(windSpeed,0.16))+(0.4275*fahrenheit*Math.pow(windSpeed, 0.16));
		
		System.out.println(" The wind chill index is: " +(int)(windChill*100)/100.0);
		
		
	}

}
