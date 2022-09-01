package chapters.Chapter03;

import java.util.Scanner;

public class CheckPoint318 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter a number between 1 and 100 ");
		
		int number1=input.nextInt();
		
		boolean isInRange = number1>1 && number1<100;
		System.out.println(number1+" "+isInRange );
		
		System.out.println(" enter a number between -1 and -100");
		int number2=input.nextInt();
		
		boolean isInRange2=number2>-100 && number2<=-1;
		System.out.println(number2+" "+isInRange2);
		
	
	
	}
	
	
	

}
