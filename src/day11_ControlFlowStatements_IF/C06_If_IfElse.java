package day11_ControlFlowStatements_IF;
import java.util.Scanner;
public class C06_If_IfElse {
    public static void main(String[] args) {
/*
        //2 adet A ve B int sayıyı karşılaştırın
        //A Büyüktür B den
        //B büyüktür A dan
        //A ve B eşittir

        int a=10;
        int b=20;
        if(a>b){
            System.out.println("A büyüktür B den");
        }else if(a==b){
            System.out.println("A ve B eşittir");
        }else {
            System.out.println("B büyüktür A dan");
        }


        int x=10,y=0;
        if(x==10){
            y=20;
        }
         if(x==20){
            y=30;
        }
        System.out.println("y = " + y);


        String str="";
        int degree=19;
        if(degree>=20){
            str="butterfly flies";
        }else {
            str=null;
        }
        System.out.println(str);

 */

        int aysePara=1;

        if(aysePara<5){
            aysePara=aysePara+10;
        }
        System.out.println("aysenin parasi = " + aysePara);

        int x=10;
        int y=10;
        if(x==y){
            System.out.println("sayi esit");
        }else{
            System.out.println("sayılar eşit degil");
        }
        int a=90;
        int b=40;
        int c=50;
        if((a+b+c==180)){
            if(a==90 || b==90 || c==90){
                System.out.println("bu bir dik üçgendir");
            }
            else{
                System.out.println("bu üçgen dik üçgen degildir");
            }
        }else{
            System.out.println("bu bir üçgen degildir");
        }


    }
}
