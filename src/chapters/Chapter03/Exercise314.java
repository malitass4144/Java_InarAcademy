package chapters.Chapter03;

import java.util.Scanner;

public class Exercise314 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" head or tail (enter 0 for head, 1 for tail)");
		
		int prediction=input.nextInt();
		
		int headOrTailRandom=(int)(Math.random()*2);
		
		if(headOrTailRandom==0 && prediction==0) {
			System.out.println(" it is head!  congrulations you won! ");
		}else if(headOrTailRandom==0 && prediction==1) {
			System.out.println(" it is head! you lost! ");
		}else if(headOrTailRandom==1 && prediction==1) {
			System.out.println(" it is tail!congrulations you won! ");
		}else {
			System.out.println( "it is tail! you lost!");
		}
		
	}

}
