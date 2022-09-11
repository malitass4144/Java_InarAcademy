package chapters.chapter05;

import java.util.Scanner;

public class Listing053 {

	public static void main(String[] args) {

		int number=(int)(Math.random()*100);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("computer choosed an integer between 0 and 100 guess it");
		
		int guess=-1;
		
		while(guess!=number) {
			
			System.out.print("\nenter your guess: ");
			
			guess=input.nextInt();
			
			if(number==guess)
				System.out.println("your guess is correct "+number);
			else  if(guess>number)
				System.out.println("your number is too high ");
			else 
			System.out.println(" your number is too low ");
		
		}
		
	
	}
}
