package chapters.Chapter04;

import java.util.Scanner;

public class Listing042 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		System.out.println("Enter first city");
		
		String city1=input.nextLine();
		
		System.out.println(" Enter second city");
		
		String city2=input.nextLine();
		
		if(city1.compareTo(city2)<0) {
			System.out.println(" The cities in alphabetical order are  "+city1+" "+city2);
		}else {
			System.out.println("The cities in alphabetical order are "+city2+" "+city1);
		}
	}

}
