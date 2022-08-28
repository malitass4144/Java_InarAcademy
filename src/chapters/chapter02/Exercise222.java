package chapters.chapter02;

import java.util.Scanner;

public class Exercise222 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" enter the money you want to convert it to dollars and cents (in cents,for ex;1156cents) ");
		
		int amount=input.nextInt();
		
		int dollars =amount/100;
		
		int cents=amount%100;
		
		System.out.println(" you have "+dollars+"$ and "+cents+" cents");
		
		
		
		
		
	}

}
