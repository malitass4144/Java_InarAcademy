package chapters.Chapter04;

import java.util.Scanner;

public class Exercise413 {

	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		
		System.out.println(" enter a letter ");
		
		String letter=input.next();
		
		char ch=letter.charAt(0);
		
		ch=Character.toUpperCase(ch);
		
		if(ch>'Z' || ch<'A')
			System.out.println(" invalid input ");
		else if(ch=='A' ||   ch=='E' || ch=='I' || ch=='O' || ch=='U')
			System.out.println(letter+" letter is a vowel");
		else System.out.println(letter+" letter is a constant");

	}

}
