package chapters.Chapter03;

import java.util.Scanner;

public class CheckPoint034 {

	public static void main(String[] args) {
		
		System.out.println(" please enter an integer ");
		
		Scanner input =new Scanner(System.in);
		
		int y=input.nextInt();
		
		if( y>=0 ) {
			
		int	x=1;
		
		System.out.println(" x: "+x);
		}else System.out.println(" we cannot assign a value to x ");

	}

}
