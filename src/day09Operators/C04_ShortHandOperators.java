package day09Operators;

public class C04_ShortHandOperators {
    public static void main(String[] args) {

        //assingret atama
        int number =10;
        number=20;
        System.out.println("number = " + number);

        String word = "Java Programming lnguage";
        System.out.println("word = " +word);

        word="Golden Globe";

        System.out.println("----------------------");


        int x =100;
        System.out.println("x = " + x);
        x = x+100;  // x =100+100
        x+=100;
        System.out.println("x = " +x);

        String str="Golden";
        str+="Globe";      //str = str + " globe";
        System.out.println(str);

        double num1 = 3.5;
        System.out.println("num1 = " + num1);

       double bakiye=3520.50;
       System.out.println("bakiye = " + bakiye);
       //1500tl
        bakiye+=1500;

        System.out.println("----------------------");

        double maas = 42500.50;
        System.out.println("mas = " + maas);

        maas *=2;
        System.out.println("maas = "+ maas);

        double gramAltin = 0.001;
        gramAltin *= 120;

        System.out.println("----------------------");

        double num2 = 50000.0;
        num2 /=2;
        System.out.println("num2 = " + num2);

        System.out.println("----------------------");

        double num3 = 100;
        num3 %=3;
        System.out.println("num3 = " + num3);

        System.out.println("----------------------");

        int odenecekTutar = 1130;
        System.out.println("odenecekTutar = " + odenecekTutar);

        int ikiyuzluk = 1130/200;
        odenecekTutar %=200;
        System.out.println("odenecekTutar = " + odenecekTutar);
        int yuzluk = odenecekTutar/100;
        odenecekTutar %=100;
        int yirmilik = odenecekTutar/20;
        odenecekTutar %=20;
        int onluk =odenecekTutar/10;

       // System.out.println("1130Tl için: "+ikiyuzluk+" tane ikiyuzluk banknot "+yuzluk+" yuzluk banknot "+yirmilik+" tane yirmilik banknot "+onluk"tane onluk banknot odemeniz gerekmektedir.");


    }
}
