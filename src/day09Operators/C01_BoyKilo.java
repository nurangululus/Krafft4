package day09Operators;

import java.util.Scanner;

public class C01_BoyKilo {
    public static void main(String[] args) {

        //kullanıcıdan boy(ondalık) ve kilosunu

        Scanner input = new Scanner(System.in);

        System.out.println("Boyunuzu giriniz :");
        double boy = input.nextDouble();

        System.out.println("Kilonuzu giriniz");
        double kilo = input.nextDouble();

        input.nextLine();
        System.out.println("Lütfen isminizi giriniz ");
        String isim = input.nextLine();

        System.out.println("soyisminizi giriniz :");
        String soyisim = input.nextLine();


        System.out.println(isim+" "+" boyunuz:  "+boy+" m kilonuz: "+kilo+" kg");




         {
        }

    }
}
