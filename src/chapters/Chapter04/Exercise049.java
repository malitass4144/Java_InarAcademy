package chapters.Chapter04;

import java.util.Scanner;

public class Exercise049 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.print(" enter a character ");
		
		String str=input.next();
		
		char ch=str.charAt(0);
		
		System.out.println(" for "+str+" unicode is: "+(int)ch);
	}

}
