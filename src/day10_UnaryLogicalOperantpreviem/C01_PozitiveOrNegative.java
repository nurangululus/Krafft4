package day10_UnaryLogicalOperantpreviem;

import java.util.Scanner;

public class  C01_PozitiveOrNegative {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz :");
        int number =scan.nextInt();

        boolean isPozitive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number==0;

        System.out.println(number+" is pozitive number: "+isPozitive);
        System.out.println(number+" is negative number: "+isNegative);
        System.out.println(number+" is zero number: "+isZero);


    }
}
