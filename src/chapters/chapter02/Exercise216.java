package chapters.chapter02;

import java.util.Scanner;

public class Exercise216 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println(" Enter one side of hexagon that you want to compute its area ");

		double oneSideOfHexagon=input.nextDouble();
		
		double areaOfHexagon=(3*Math.pow(3,0.5)/2)*Math.pow(oneSideOfHexagon,2);
		
		System.out.println(" The area of the hexagon is ; "+(int)(areaOfHexagon*100)/100.0);
		
		
	
	
	}
	
	

}
