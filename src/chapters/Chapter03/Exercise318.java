package chapters.Chapter03;

import java.util.Scanner;

public class Exercise318 {

	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter weight of package ");
		
		double weight=input.nextDouble();
		
		if(weight<=1)System.out.println("3.5$");
		else if(weight<=3)System.out.println("5.5$");
		else if(weight<=10)System.out.println("8.5$");
		else if(weight<=20)System.out.println("10.5$");
		else System.out.println(" your package can not be shipped");

	}

}
