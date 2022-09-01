package chapters.Chapter03;

import java.util.Scanner;

public class Exercise039 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of an ISBN as integer:");
	
        int isbn1=input.nextInt();	
        int isbn2=input.nextInt();	
        int isbn3=input.nextInt();	
        int isbn4=input.nextInt();	
        int isbn5=input.nextInt();	
        int isbn6=input.nextInt();	
        int isbn7=input.nextInt();	
        int isbn8=input.nextInt();	
        int isbn9=input.nextInt();
        int isbn10=(int)((isbn1*1+isbn2*2+isbn3*3+isbn4*4+isbn5*5+isbn6*6+isbn7*7+isbn8*8+isbn9*9)%11);
        
        if(isbn10==10) {
        	System.out.println(" The ISBN-10 number is : "+isbn1+isbn2+isbn3+isbn4+isbn5+isbn6+isbn7+isbn8+isbn9+"X");
        	
        }else {
        	System.out.println(" The ISBN-10 number is : "+isbn1+isbn2+isbn3+isbn4+isbn5+isbn6+isbn7+isbn8+isbn9+isbn10);
        }
        
	
	
	
	}

}
