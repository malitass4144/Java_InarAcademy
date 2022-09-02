package chapters.Chapter03;

import java.util.Scanner;

public class Exercise321 {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Enter year: ");
		
		int year=input.nextInt();
		
		System.out.println(" Enter month:(3: March, 4: April, …, 12: December) January and February\r\n"
				+ "are counted as months 13 and 14 of the previous year.");
		
		int month=input.nextInt();
		
		System.out.println(" Enter the day of the month: ");
	
		int dayOfMonth=input.nextInt();
		
		int dayOfWeek=(dayOfMonth+(26*(month+1))/10+(year%10)+((year%10)/4)+(year/100)/4+(5*(year/100)))%7;
				
				switch(dayOfWeek) {
				case 0 :System.out.println("Sunday");break;
				case 1 :System.out.println("Monday");break;
				case 2 :System.out.println("Tuesday");break;
				case 3 :System.out.println("Wednesday");break;
				case 4 :System.out.println("Thursday");break;
				case 5 :System.out.println("Friday");break;
				case 6 :System.out.println("Saturday");break;
			
				
				
				}
	
	}

}
