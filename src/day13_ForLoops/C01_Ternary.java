package day13_ForLoops;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        /*
         kullanicidan pozitif bir tamsayi alin
         sayi cift ise "sayi cift"
         degilse "tek sayi" yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bpozitif bir sayı giriniz");
        int num=scan.nextInt();

        if (num%2==0){
            System.out.println("çift sayı");
        }else{
            System.out.println("tek sayı");
        }

        System.out.println("-------------------");

       // System.out.println(num%2==0)? "çift Sayı":"Tek Sayı";

       //(conditon) ? (return if true) : (return if false;


    }
}
