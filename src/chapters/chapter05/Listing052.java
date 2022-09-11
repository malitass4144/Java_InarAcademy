package chapters.chapter05;

import java.util.Scanner;

public class Listing052 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println(" computer choosed an integer (between 0 and 100 )for you please guess it ");
		
		int number =(int)(Math.random()*100);
		int answer=input.nextInt();
		
		if(answer==number) {
			System.out.println(" you knew the number " +number+ " computer choosed for you ");
		}else System.out.println(" wrong guess! number is : "+number);
	}

}
