package chapters.chapter02;

import java.util.Scanner;

public class Exercise021 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter celcius degree you want to convert to fahrenheit;");
		
		double celcius = input.nextDouble();
		
		double fahrenheit = (9.0/5)*celcius+32;
		
		System.out.println(celcius +" celcius is " + fahrenheit+ " fahrenheit ");
		
		
		
		
	}

}
