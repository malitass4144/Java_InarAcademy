package chapter02;

import java.util.Scanner;

public class FaizHesaplama {
    public static void main(String[] args) {
       Scanner klavye = new Scanner(System.in);

        System.out.println(" Yıllık faiz oranını giriniz : ( Örn: 4.5) ");

        double yillikfaizorani = klavye.nextDouble() ;

        System.out.println("Kaç yılda ödemek istiyorsunuz ? (Örn: 8 ");

        int yil = klavye.nextInt();

        System.out.println("Borc alinacak miktar :(Örn: 1567.98");

            double borcmiktari=klavye.nextDouble() ;

            double aylikfaizorani = yillikfaizorani / 1200 ;

            double aylikodeme = 




    }
}
