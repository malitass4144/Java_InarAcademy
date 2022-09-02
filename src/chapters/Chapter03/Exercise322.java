package chapters.Chapter03;

import java.util.Scanner;

public class Exercise322 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" please enter x and y");
		
		double radius =10;
		double x1=0;
		double y1=0;
		
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		
		double distanceOfInput=Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2), 0.5);
		
		if (distanceOfInput>radius) {
			System.out.println("("+x2+","+y2+") is not in the circle ");
		}else if(radius>distanceOfInput) {
			System.out.println("("+x2+","+y2+") is in the circle ");
		}else 
			System.out.println("("+x2+","+y2+") is in the border ");
		
	}}

	


