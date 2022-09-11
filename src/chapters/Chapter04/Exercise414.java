package chapters.Chapter04;

import java.util.Scanner;

public class Exercise414 {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter a letter grade ");
		
		char ch=input.next().charAt(0);
		
		ch=Character.toUpperCase(ch);
		
		if (ch=='A') System.out.println("The numeric value for grade " + ch + " is 4");
		else if(ch=='B')System.out.println("The numeric value for grade " + ch + " is 3");
		else if(ch=='C')System.out.println("The numeric value for grade " + ch + " is 2");
		else if(ch=='D')System.out.println("The numeric value for grade " + ch + " is 1");
		else if(ch=='E')System.out.println("The numeric value for grade " + ch + " is 0");
		else System.out.println("invalid input");
		
		} 

		
		
		
		
	}


