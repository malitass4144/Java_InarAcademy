package weeks.week_03;

import java.util.Scanner;

public class Assignment_03_Question_01 {

	public static void main(String[] args) {

    Scanner input=new Scanner(System.in);
    
    System.out.println("Please enter your of service ");
    
    int yearsOfService =input.nextInt();
    
    if(yearsOfService>5) {
    	System.out.println("Please enter your salary;");
    	
    	double salary=input.nextDouble();
    	
    	double bonus=salary*0.05;
    	
    	System.out.println("your net bonus amount ; "+bonus+"$ ");
    
    }else System.out.println(" We regret to inform you that you cant get a bonus salary");
    
    
    
    
    
	}

}
