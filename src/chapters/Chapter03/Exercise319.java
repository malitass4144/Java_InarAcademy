package chapters.Chapter03;

import java.util.Scanner;

public class Exercise319 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter three sides of a triangle");
		
		double firstSide =input.nextDouble();
		double secondSide =input.nextDouble();
		double thirdSide =input.nextDouble();
		double perimeter=firstSide+secondSide+thirdSide;
		
		if(firstSide+secondSide>thirdSide && secondSide+thirdSide>firstSide && firstSide+thirdSide>secondSide) {
			System.out.println("the perimeter of triangle is "+(int)(perimeter*100)/100.0);
		}else System.out.println("the input is invalid.");
		
		
	}

}
