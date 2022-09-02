package chapters.Chapter03;

import java.util.Scanner;

public class Exercise317 {

	public static void main(String[] args) {

		Scanner input =new Scanner(System.in);
		
		System.out.println("scissor (0), rock (1), paper (2):");
		
		int pc=(int)(Math.random()*3);
		
		int prediction=input.nextInt();
		
		if (pc==0) {
			System.out.print("The computer is scissor and you are ");
			if(prediction==2)
				System.out.println("paper,you lost");
			if(prediction==1)
				System.out.println("rock you won!");
			else System.out.println("scissor,it is draw");
			
		}	if (pc==1) {
			System.out.print("The computer is rock and you are ");
			if(prediction==2)
				System.out.println("paper,you won");
			if(prediction==1)
				System.out.println("rock it is draw");
			else System.out.println("scissor,you lost");
			
		}	if (pc==2) {
			System.out.print("The computer is paper and you are ");
			if(prediction==2)
				System.out.println("paper,it is draw");
			if(prediction==1)
				System.out.println("rock you lost!");
			else System.out.println("scissor,");
			
		}
		
	}

}
