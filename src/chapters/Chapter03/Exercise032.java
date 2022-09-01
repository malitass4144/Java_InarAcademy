package chapters.Chapter03;

import java.util.Scanner;

public class Exercise032 {

	public static void main(String[] args) {
		
		int a=(int)(Math.random()*10);
		
		int b=(int)(Math.random()*10);
		
		int c=(int)(Math.random()*10);
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(a+" + "+b+" + "+c+" = ? ");
		
		int prediction=input.nextInt();
		
		int result=a+b+c;
		
		if(prediction==result) {
			System.out.println(" true ");
			
		}else {
			System.out.println(" false ");
		}
		
		

	}

}
