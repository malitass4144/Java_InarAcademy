package chapters.Chapter03;

import java.util.Scanner;

public class Exercise037 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" enter your money in cents");
		 
		int money=input.nextInt();
		
		int dollars=money/100;
		
		int remainingCentsFromDollars=money%100;
		
		int quarters=remainingCentsFromDollars/25;
		
		int remainingCentsFromQuarters=remainingCentsFromDollars%25;
		
		int dimes=remainingCentsFromQuarters/10;
		
		int remainingCentsFromDimes=remainingCentsFromQuarters%10;
		
		int cents=remainingCentsFromDimes;
		
		

		System.out.println("your money consist of :");
		System.out.println(" "+dollars+(dollars==1 || dollars==0 ? " dollar" : " dollars"));
		System.out.println(" "+quarters+(quarters==1 || quarters==0 ? " quarter" : " quarters "));
		System.out.println(" "+dimes+(dimes ==1 || dimes==0 ? " dim" : " dimes"));
		System.out.println(" "+cents+(cents ==1 || cents==0 ? " cent" : " cents"));
	    	
	    }
		
		
	}


