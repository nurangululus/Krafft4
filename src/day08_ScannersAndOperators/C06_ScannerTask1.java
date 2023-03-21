package day08_ScannersAndOperators;
import java.util.Scanner;

public class C06_ScannerTask1 {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alın
        //sayının karesini alın konsola yazdırın

        Scanner scan = new Scanner (System.in);
        System.out.println("Lütfen bir sayi giriniz");

        int girilenSayi=scan.nextInt();

        System.out.println("girilen sayi ="+girilenSayi);
        System.out.println("girilen sayinin karesi ="+girilenSayi);

        scan.close();

    }
}
