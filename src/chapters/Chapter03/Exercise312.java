package chapters.Chapter03;

import java.util.Scanner;

public class Exercise312 {

	public static void main(String[] args) {

		Scanner input= new Scanner(System.in);
		
		System.out.println(" enter a number ");
		
		int number=input.nextInt();
		//we will take number's digits 
		int number100=(int)(number/100);
		int remainingNumberFromNumber100=(int) (number%100);
		int number10=(int)(remainingNumberFromNumber100/10);
		int number1=(int)(remainingNumberFromNumber100%10);
		
		
		if(number1==number100) {
			System.out.println(number+" is a palindrome ");
		}else {
			System.out.println(number+" is not a palindrome");
		}
	}

}
