package day12_SwitchCase;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int a=20;
        int b=15;
        System.out.println("Lütfen işlem seçiniz(+,-,/,*");
        String islem= scan.next();

        switch (islem){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "*":
                System.out.println(a*b);
            default:
        }


    }
}
