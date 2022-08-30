package chapters.Chapter03;

import java.util.Scanner;

public class Listing034 {

	public static void main(String[] args) {

		//we will take from user kilogram and weight and then will compute IBM
		
		Scanner input =new Scanner(System.in);
		
		System.out.println(" Please enter your weight(in kg) and height(in meters ex:1.75cm) ");
		
		double weight=input.nextDouble();
		
		double height=input.nextDouble();
		
		double bmi =weight/Math.pow(height, 2);
		
		System.out.println(" your bmi is:  "+(int)(bmi*100)/100.0);
		
		if   (bmi<18.5) {
			System.out.println(" Underweight ");
		}
		else if(bmi<25){
			
			System.out.println(" Normal ");
		
		}else if(bmi<30) {
			
			System.out.println(" Overweight ");
		}else {
			
			System.out.println(" Obese " );
		}
		
		
		}
			
		
		
	}


