package day17_Methods;

import java.util.Scanner;

public class C04_Methods_02 {
    public static void main(String[] args) {
       // buyukSayi();
       // okkaCevir();
       // ortalama(x=5,y=12);

    }
    public static void aritmetikOrtalama(){

        double x=3,y=5,z=10;
        double result=(x+y+z)/3;
        System.out.println("ortalama:"+result);
    }
    public static void buyukSayi(){
        int x=3,y=7;
        System.out.println(Math.max(x,y));
    }
    public static void okkaCevir(){
        Scanner scan=new Scanner(System.in);
        System.out.println("kilogram: ");
        double kilogram= scan.nextDouble();
        double okka=kilogram/1.282;
        System.out.println(kilogram+" kilogram "+okka+" okkadır ");
    }
    public static void karesi(int x){
     int result=x*x;
        System.out.println(result);
    }
    public static void ortalama(int x,int y){
double ortalama=(double)(x+y)/2;
        System.out.println(ortalama);
    }
}
