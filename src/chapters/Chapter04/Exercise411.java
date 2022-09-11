package chapters.Chapter04;

import java.util.Scanner;

public class Exercise411 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter a decimal value");
		
		int value =input.nextInt();
		
		if(value<10)
			System.out.println(" the hex value is "+value);
		else if(value>=10 && value<=15)
			System.out.println("The hex value is " + (char)(value + 55));
		else {
			System.out.println("invalid input");
			System.exit(0);
		}
		
		
	}

}
