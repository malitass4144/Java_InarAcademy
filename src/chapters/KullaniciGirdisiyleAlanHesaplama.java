import java.util.Scanner;

 public class KullaniciGirdisiyleAlanHesaplama {
    public static void main (String[] args) {
        Scanner girdi = new Scanner(System.in);

        double yaricap;
        double alan;
        //yaricapı oku
        System.out.println("Alani hesaplanacak cemberin yari capini giriniz : ");
        yaricap = girdi.nextInt();

        //alanı hesapla
        alan = yaricap * yaricap * 3.14159;

        //alanı yazdır
        System.out.println("yaricapi " + yaricap+ " olan cemberin alanı : "+ alan +" dir");
    }
}








