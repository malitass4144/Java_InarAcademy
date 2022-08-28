package chapters.chapter02;

import java.util.Scanner;

public class Exercise211 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Please enter a number(year) to learn future population of the country");
	
		int years=input.nextInt();
		
		int population=312032486;
		
		int secondsInYear=60*60*24*365;
		
		int birthInYear= secondsInYear/7;
		
		int deathsInYear = secondsInYear/13;
		
		int immigrantInYear= secondsInYear/45;
		
		int lastPopulation=(population)+((birthInYear+immigrantInYear)*years)-(deathsInYear*years);
	
		
	    System.out.println(" Current population;"+lastPopulation);
	
	
	
	
	}
	
	
	
	

}
