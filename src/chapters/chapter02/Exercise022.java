package chapters.chapter02;

import java.util.Scanner;

public class Exercise022 {

	public static void main(String[] args) {

		//We will compute the volume of a cylinder
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the radius of cylinder you want to compute;");
		
		double radius = input.nextDouble();
		
		final double PI= 3.14159;
		
		double area = radius*radius*PI;
		
		System.out.println(" Please enter length of cylinder ;");
		
		double length=input.nextDouble();
		
		double volume = length*area;
		
		System.out.println(" The area of cylinder is ; " +area+" and volume ; " + volume);
		
		
		
		
		
	}

}
