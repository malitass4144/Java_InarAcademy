package chapters.Chapter03;

import java.util.Scanner;

public class Listing031 {
	
	public static void main(String[] args) {
		
		int number1 = (int)(System.currentTimeMillis()%10);
		
		int number2 = (int)(System.currentTimeMillis()/7%10);
		
		System.out.println("What is "+number1+" + " +number2+" ? ");
		
		Scanner input=new Scanner(System.in);
		
		int number= input.nextInt();
		
		if(number1+number2==number) {
		
		System.out.println(
				 number1 + " + " + number2 + " = " + number + " is " +
				 (number1 + number2 == number));

		}else { System.out.println(" yanlış cevap ");}
		
	
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
