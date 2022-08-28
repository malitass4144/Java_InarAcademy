package chapters.chapter02;

import java.util.Scanner;

public class Exercise223 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println(" Enter the driving distance (in miles): ");
		
		double distance=input.nextDouble();
		
		System.out.println(" Enter miles per gallon: ");
		
		double milesPerGalon =input.nextDouble();
		
		System.out.println(" Enter price per gallon: ");
		
		double pricePerGallon=input.nextDouble();
		
		double costOfDriving=(distance/milesPerGalon)*pricePerGallon;
		
		System.out.println(" The cost of driving is: "+(int)(costOfDriving*100)/100.0);
	}

}
