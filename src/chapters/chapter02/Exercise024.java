package chapters.chapter02;

import java.util.Scanner;

public class Exercise024 {

	public static void main(String[] args) {
      
		Scanner input=new Scanner(System.in);
		
		System.out.println(" Please enter a pound you want to convert it to kilogram; ");
		
		double pound=input.nextDouble();
		
		double kilogram=pound*0.454;
		
		System.out.println( pound +" pounds is " +kilogram +" kilograms. ");
		}

}
