package chapters.Chapter03;

import java.util.Scanner;

public class Listing038 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		int lottery=(int)(Math.random()*100);
		
		System.out.println(" enter your prediction of lottery with two digits ");
		
		int prediction =input.nextInt();
		
		int prediction1=prediction%10;
		
		int prediction2=prediction/10;
		
		int lottery1=lottery%10;
		
		int lottery2=lottery/10;
		
		
		System.out.println("lottery is "+lottery);
		
		if(prediction==lottery) {
			System.out.println(" congrulatios you won 10000$ ");
			
		}else if(prediction1==lottery2 && prediction2==lottery1) {
		System.out.println(" you won 3000$ ");
		}else if(prediction1==lottery1 || prediction1==lottery2 || lottery1==prediction2 || lottery2==prediction2) {
			System.out.println(" you won 1000$ ");
		}else {
			System.out.println("you couldnt get an award");
		}
		
		
		
	}

}
