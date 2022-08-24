package listings.listing02;

import java.util.Scanner;

public class Listing026 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println(" enter a degree in fahrenheit:");
		
		double fahrenheit=input.nextDouble();
		
		//Convert fahrenheit to celcius
		
		double celcius = (5.0f/9)*(fahrenheit-32);
		
		System.out.println(fahrenheit+" fahrenheit is; "+celcius+" in celcius ");
		
	}

}
