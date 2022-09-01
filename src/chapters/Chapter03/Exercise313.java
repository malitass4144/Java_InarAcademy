package chapters.Chapter03;

import java.util.Scanner;

public class Exercise313 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("enter your status and income");
		
		System.out.println(" 1:Single");
		System.out.println("2:Married Filing Jointly\r\n"
				+ "or Qualifying Widow(er)");
		System.out.println("3:Married Filing Separately");
		System.out.println("4:Head of Household");
		
		int status=input.nextInt();
		
		double income=input.nextDouble();
		
		if(status==1) {
			if(income<=8350) {
				double tax=income*0.10;
			}else if(income<=33950) {
				double tax=8350*0.10+(income-8350)*0.15;
			}else if(income<=82250) {
				double tax=8350*0.10+(33950-8350)*0.15+(income-33950-8350)*0.25;
			}else if(income<=171550) {
				double tax=8350*0.10+(33950-8350)*0.15+(82250-33950-8350)*0.25+(income-8350-33950-82250)*0.28;
			}else if(income<=372950) {
				double tax=8350*0.10+(income -8350)*0.15+(income-33950-8350)*0.25+(income-8350-33950-82250)*0.28+(income-8350-33950-82250-171550)*0.33;
			}else {
				double tax=8350*0.10+(income-8350)*0.15+(income-33950-8350)*0.25+(income-8350-33950-82250)*0.28+(income-8350-33950-82250-171550)*0.35;
			}System.out.println("your tax is : "+tax);
			
	   }if(status==2) {
		   if(income<=16700) {
				double tax=income*0.10;
			}else if(income<=67900) {
				double tax=16700*0.10+(income-16700)*0.15;
			}else if(income<=137500) {
				double tax=income*0.25;
			}else if(income<=208850) {
				double tax=income*0.28;
			}else if(income<=372950) {
				double tax=income*0.33;
			}else {
				double tax=income*0.35;
		}
		

	}if(status==3) {
		   if(income<=8350) {
				double tax=income*0.10;
			}else if(income<=33950) {
				double tax=income*0.15;
			}else if(income<=68525) {
				double tax=income*0.25;
			}else if(income<=104425) {
				double tax=income*0.28;
			}else if(income<=186475) {
				double tax=income*0.33;
			}else {
				double tax=income*0.35;
		}
		

	}if(status==4) {
		   if(income<=11950) {
				double tax=income*0.10;
			}else if(income<=45500) {
				double tax=income*0.15;
			}else if(income<=117450) {
				double tax=income*0.25;
			}else if(income<=190200) {
				double tax=income*0.28;
			}else if(income<=372950) {
				double tax=income*0.33;
			}else {
				double tax=income*0.35;
			}System.out.println("your tax is : "+tax);
	}
	
	
	
	}

}
