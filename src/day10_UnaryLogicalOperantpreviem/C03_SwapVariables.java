package day10_UnaryLogicalOperantpreviem;

import java.util.Scanner;

public class C03_SwapVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println("a = " + a);  // a =30
        System.out.println("b = " + b);  // b =15

        int temp=a;  // temp =30
        a=b;         // a= 15
        b=temp;      // b=30

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
