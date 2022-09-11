package chapters.Chapter04;

import java.util.Scanner;

public class Exercise043 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter an ASCII code: ");
		
		int ascii=input.nextInt();
		
		char ch=(char)ascii;
		
		System.out.println(" for the integer that is "+ascii+" ASCII code is: "+ch);
		
	}

}
