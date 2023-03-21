package day5_revlewSecondiWeek;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args) {
        int a=26;
        int b=25;
        //a b ye eşittir ==
        System.out.println("a b ye eşit mi "+(a==b));

        // a b ye eşit değildir !=
       System.out.println("a b den farklı mi "+(a!=b));

       // a b den < küçüktür
        System.out.println("a b den küçük mü "+(a<b));

        // a b den < küçüktür
        System.out.println("a b den küçük mü "+(a<b));

        // Girilen 3 basamaklı bir sayının basamaklarına göre
        // tersini bir sayı olarak ekrana yazdırınız


        Scanner sc=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz :");
        int sayi=sc.nextInt();

        int birler=sayi%10;//5
        System.out.println("birler = " + birler);

        int onlar=(sayi/10)%10;//3
        System.out.println("onler = " + onlar);

        int yuzler=sayi/100;//4
        System.out.println("yuzler = " + yuzler);

        //534 oluşturacağız
        int yenisayi=birler*10+onlar*10+yuzler;
        System.out.println("onler = " + onlar);






    }
}
