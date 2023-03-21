package day10_UnaryLogicalOperantpreviem;

import java.util.Scanner;

public class C02_EvenlyDivisible {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");

        int number = scan.nextInt();

        boolean isDivisibleBy2 = number%2==0;
        boolean isDivisibleBy3 = number%3==0;
        boolean isDivisibleBy5 = number%5==0;

        System.out.println("isDivisibleBy2 = " + isDivisibleBy2);
        System.out.println("isDivisibleBy3 = " + isDivisibleBy3);
        System.out.println("isDivisibleBy5 = " + isDivisibleBy5);


    }
}
