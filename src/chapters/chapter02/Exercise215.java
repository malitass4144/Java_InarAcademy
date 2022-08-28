package chapters.chapter02;

import java.util.Scanner;

public class Exercise215 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" Please enter the first coordinates you want to compute distance; (in x,y)");
		
        double x1 =input.nextDouble();
		
		double y1=input.nextDouble();
		
		System.out.println(" please enter the last coordinates you want to compute distance between first and second; ");
		
		
		
		double x2=input.nextDouble();
		
		double y2=input.nextDouble();
		
		double distance =Math.pow(Math.pow(x2-x1,2)+Math.pow(y2-y1,2),0.5);
		
		System.out.println(" The distance between the two points is " + distance);
		
		
		
		
		

	}

}
