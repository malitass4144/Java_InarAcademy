package chapters.chapter05;

import java.util.Scanner;

public class Listing051 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		int number1=(int)(Math.random()*10);
		
		int number2=(int)(Math.random()*10);
		
		System.out.println("what is "+number1+" + "+number2+" :   ?");
		
		int answer=input.nextInt();
		
	while(number1+number2!=answer) {
			
			System.out.println(" the answer is incorrect please try again \n"
					+ " what is "+number1+" + "+number2+" :   ? ");
			
			answer=input.nextInt();
		}System.out.println(" the answer is true congrulations ");
		
		
	}

}
