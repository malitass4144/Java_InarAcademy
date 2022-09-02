package chapters.Chapter03;

import java.util.Scanner;

public class Exercise323 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a point with two coordinates:");
	
		//r for rectangle
		double rx=5;
		double ry=5/2;
		
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		
		if(y1>ry || x1>rx) {
			System.out.println("("+(int)x1+","+(int)y1+") is not in the rectangle ");
		}else
			System.out.println("("+(int)x1+","+(int)y1+") is in the rectangle ");
	
	}

}
