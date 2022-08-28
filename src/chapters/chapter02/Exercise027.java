package chapters.chapter02;

import java.util.Scanner;

public class Exercise027 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Please enter minutes you want to convert to years and days");
		
		double minutes=input.nextDouble();
		
		long years= (long)minutes/(60*24*365);
		
		double days =(int)(((minutes/60/24)%365)*10)/10.0;
		
		System.out.println(minutes+" minutes is ;"+years+" years and "+days+" days.");
		
		
		
		
		
		
	}

}
