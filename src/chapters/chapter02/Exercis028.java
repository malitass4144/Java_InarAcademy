package chapters.chapter02;

import java.util.Scanner;

public class Exercis028 {

	public static void main(String[] args) {
	
	long totalMilliSeconds= System.currentTimeMillis();
	
	long totalSeconds = totalMilliSeconds/1000;
	
	long currentSecond=totalSeconds%60;
	
	long totalMinutes =totalSeconds/60;
	
	long currentMinute=totalMinutes%60;
	
	long totalHours=totalMinutes/60;
	
	System.out.println("Please Enter the time zone offset to GMT:");
	
	Scanner input=new Scanner(System.in);
	
	long offset=input.nextLong();
	
	long currentHour=(totalHours+offset)%24;
	
	System.out.println(" Current time is ; "+currentHour+ " : "+currentMinute+" : "+currentSecond);
	

	
	
	
	
	
	
	
	
	}
	}

		