package chapters.Chapter03;

import java.util.Scanner;

public class Exercise310 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		int number1=(int)(Math.random()*100);
		
		int number2=(int)(Math.random()*100);
		
		System.out.println(number1+" + "+number2+" =? ");
		
		int answer=input.nextInt();
		
		if (answer==number1+number2) {
			System.out.println(number1+" + "+number2+" =? "+answer);
			System.out.println(" true ");
		}else {
			System.out.println(number1+" + "+number2+" =? "+answer);
			System.out.println("false");
		}
	}

}
