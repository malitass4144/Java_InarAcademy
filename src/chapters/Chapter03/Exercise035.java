package chapters.Chapter03;

import java.util.Scanner;

public class Exercise035 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Enter today's day: (0 for sunday) ");
		
		System.out.println(" Enter the number of days elapsed since today: ");
		
		int today=input.nextInt();
		
		int daysElapsed=input.nextInt();
		
		int futureDay=(today+daysElapsed)%7;
	    
		switch(futureDay) {
		case 0:System.out.println("sunday");break;
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wednesday");break;
		case 4:System.out.println("thursday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		}
	}

}
