package day12_SwitchCase;

public class C02_Homework {
    public static void main(String[] args) {
        //Bir program yazın
        // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
        // 2 veya 3 farklı yol ile çözmeye çalışın
      /*
        int x,y,z;
        x=50;
        y=65;
        z=60;
        System.out.println("max değer"+(Math.max(Math.max(x,y),z) ));

       if (x>=y&&x>=z){
           System.out.println(x);
       }else if(y>=x&&y>=z){
           System.out.println(y);
       }else {
           System.out.println(z);
       }

       */
       //3 sayı alın sayılar eşit olan sayıyı ekrana getiren
        //(min 2 sayı eşit olmalı)
        // eşit sayı yok ise ekrana eşit sayı yoktur
        // yazan programı yazınız

        int a,b,c,d;
       a=23;
       b=14;
       c=23;
       if (a==b){
           System.out.println(a);
       }else if(b==c){
           System.out.println(b);
       }else if(a==c){
           System.out.println(c);
       }else {
           System.out.println("Eşit sayı yoktur");
       }

    }
}
