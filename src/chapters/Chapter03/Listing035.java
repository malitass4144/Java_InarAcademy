package chapters.Chapter03;

import java.util.Scanner;

public class Listing035 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println(" enter your status ");
		
		System.out.println(" 0:for single");
		
		System.out.println(" 1:for Married Filing Jointly\r\n"
				+ "or Qualifying Widow(er))");
		
		System.out.println(" 2: for Married Filing Separately)");
		
		System.out.println(" 3:for Head of Household");
		
		int status=input.nextInt();
		
		System.out.println(" enter your taxable income ");
		
		double taxableincome=input.nextInt();
		
		double tax;
		if(status==0) {
			if (taxableincome<=8350) {
				tax=taxableincome*0.1;
			}else if(taxableincome<=33950) {
				tax=taxableincome*0.15;
			}else if(taxableincome<=82250) {
				tax=taxableincome*0.25;
			}else if(taxableincome<=171550) {
				tax=taxableincome*0.28;
			}else if(taxableincome<=372950) {
				tax=taxableincome*0.33;
			}else {
				tax=taxableincome*0.35;
				
			}System.out.println((int)(tax*100)/100.0);
			
		}
		
		
	}

}
