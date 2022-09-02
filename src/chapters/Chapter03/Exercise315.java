package chapters.Chapter03;

import java.util.Scanner;

public class Exercise315 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please enter your prediction of lottery");
		
		int lottery=(int)(Math.random()*900)+100;
		
		int prediction=input.nextInt();
		
		//We are taking Digits
		
		int l1=lottery/100;
		
		int l2=(lottery%100)/10;
		
		int l3=lottery%10;
		
		int p1=prediction/100;
		
		int p2=(prediction%100)/10;
		
		int p3=prediction%10;
		
		if (lottery==prediction) {
			System.out.println( "Congrulations you won 10000$ prize! lottery is "+lottery+" and your prediction is "+prediction);
		}else if((p1==l1 || p1==l2 || p1==l3)&&(p2==l1 || p2==l2 || p2==l3) &&(p3==l1 || p3==l2 || p3==l3)) {
			System.out.println(" Congrulations you won 3000$ prize! lottery is "+lottery+" and your prediction is "+prediction);
		}else if(p1==l1 || p1==l2 || p1==l3 || p2==l1 || p2==l2 || p2==l3 || p3==l1 || p3==l2 || p3==l3) {
			System.out.println(" Congrulations you won 1000$ prize! lottery is "+lottery+" and your prediction is "+prediction);
		}else {
			System.out.println(" you lost ! lottery is  "+lottery+" and your prediction is "+prediction);
		}
	}

}
