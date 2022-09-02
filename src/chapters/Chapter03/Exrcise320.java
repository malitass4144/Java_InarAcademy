package chapters.Chapter03;

import java.util.Scanner;

public class Exrcise320 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println(" enter fahrenheit(-58 and between 41)  and wind speed(must be bigger than 2)");

	    double fahrenheit =input.nextDouble();
	    
	    double windSpeed=input.nextDouble();
	    
	    double windChill=35.74+(0.6215*fahrenheit)-(35.75*Math.pow(windSpeed, 0.16))+(0.4275*fahrenheit*Math.pow(windSpeed, 0.16));
	    
	    if(fahrenheit>41 || fahrenheit<-58 || windSpeed<2)
	    	System.out.println(" invalid input ");
	    else System.out.println(" windchill is : "+windChill);
	    
	
	}

}
