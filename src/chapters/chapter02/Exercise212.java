package chapters.chapter02;

import java.util.Scanner;

public class Exercise212 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Enter speed and acceleration: ");
	
		double speed=input.nextDouble();
		
		double accelaration=input.nextDouble();
		
		double length = (int)((speed*speed)/(2*accelaration)*100)/100.0;
		
		System.out.println(" The minimum runway length for this airplane is ; " +length);
		
	
	
	}
	

}
