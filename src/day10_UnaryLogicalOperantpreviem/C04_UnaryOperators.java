package day10_UnaryLogicalOperantpreviem;

public class C04_UnaryOperators {
    public static void main(String[] args) {
        //+,-,++,--
        int num1= + 3;

        int num2= - 2;

        System.out.println(num1>0);  //true
        System.out.println(num2>0);  //false

        System.out.println("--------------------");


        int a = 10;
        ++a;  //pre increment : sayisinin hemen bir arttırıyor //a=11
        System.out.println(a);  //11

        --a;
        System.out.println("a = " + a); //10

        System.out.println("--------------------");

        int b =99;

        System.out.println(++ b);

        int c=99;
        System.out.println(++ c);  // c'yi konsola 99 --> c=100;
        System.out.println(c);  //100

        System.out.println("--------------------");

        int x=200;

        System.out.println(--x);  //pre decrement 200

        int y=201;
        System.out.println(y--);  //post decrement consola=>201  y=200
        System.out.println(y);  //200

        System.out.println("--------------------");




    }
}
