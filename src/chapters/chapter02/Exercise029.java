package chapters.chapter02;

import java.util.Scanner;

public class Exercise029 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
	System.out.println(" Please enter v0 and v1 and time(in seconds):");
		
	    int v0=input.nextInt();
		
		int v1=input.nextInt();
		
		int time=input.nextInt();
		
	    double averageAccelaration=(int)((Math.abs(v0-v1)/time)*100)/100.0;
	    
	    System.out.println(" average accelaration is ; " +averageAccelaration);
	    
	    
		
		
		
		
		
	}

}
