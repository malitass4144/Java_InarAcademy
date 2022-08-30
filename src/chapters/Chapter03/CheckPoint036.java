package chapters.Chapter03;

import java.util.Scanner;

public class CheckPoint036 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" please enter your pay ");
		
		double pay=input.nextDouble();
		
		if (pay>=90) {
			
			pay =pay+pay*(0.03);
			
			System.out.println(" congrulations! your payment increased %3 and current payment is: "+ (int)(pay*100)/100.0);
			
		}else { 
			pay=pay+pay*(0.01);
			
			System.out.println(" your payment increased %3 and current payment is: "+(int)(pay*100)/100.0);
			
			
			
			
		}
	}

}

