package listings.listing02;

import java.util.Scanner;

public class Listing025 {
			
			public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("enter an integer for seconds :");
				
				int seconds = input.nextInt();
				
				int minutes = seconds/60;
				int remainingSeconds = seconds %60;
				
				System.out.println(seconds+" seconds: "+ minutes +" minutes and "+remainingSeconds+" seconds ");
			}

}
