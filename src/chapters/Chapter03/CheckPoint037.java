package chapters.Chapter03;

import java.util.Scanner;

public class CheckPoint037 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" please enter an integer: ");
		
		double number = input.nextDouble();
		
		if(number%2==0) {
			
			System.out.println( number+" is even ");
			
			
		}else {System.out.println(number+" is odd");
			
			
		}
		
		
	}

}
