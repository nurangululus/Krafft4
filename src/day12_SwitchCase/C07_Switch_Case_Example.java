package day12_SwitchCase;

import java.util.Scanner;

public class C07_Switch_Case_Example {
    public static void main(String[] args) {
        //+,-,*,/
        // 4 işlem yapacak şekilde bir hesap makinesi yapın
        // kullanıcıdan 2 sayı alın
        //yapmak istediği işlemi seçsin +,-,,/
        //hatalı işlem girişlerinde kullanıcıya uyarı verin
        //ekrana sonuç döndüren programı yazınız.
       /*
        Scanner scan=new Scanner(System.in);

        System.out.println("Sayı 1 : ");
        double x= scan.nextDouble();
        System.out.println("Sayı 2 : ");
        double y= scan.nextDouble();
        System.out.println("Lütfen işlem seçiniz (+,-,*,/)");
        String islem=scan.next();

        switch (islem){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*:":
                System.out.println(x*y);
                break;
            case "/":
                System.out.println(x/y);
                break;

        }

        */

// haftanın gününü kullanıcıdan alın ve ekrana o günün ismini yazdırın
 // 1 Pazartesi
 // 3 çarşamba
 // 7 pazar

        int haftaningunu=6;
 switch (haftaningunu) {
     case 1:
         System.out.println("pazartesi");
         break;
     case 2:
         System.out.println("salı");
         break;
     case 3:
         System.out.println("çarşamba");
         break;
     case 4:
         System.out.println("perşembe");
         break;
     case 5:
         System.out.println("cuma");
         break;
     case 6:
         System.out.println("cumartesi");
         break;
     case 7:
         System.out.println("pazar");
         break;
     default:
         System.out.println("hatalı giriş 1 ile 7 dahil arasında bir gün giriniz");


        }
    }
}
