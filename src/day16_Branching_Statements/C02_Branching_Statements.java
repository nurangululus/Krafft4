package day16_Branching_Statements;

import java.util.Scanner;

public class C02_Branching_Statements {
    public static void main(String[] args) {
        //0 ve 20 dahil aradaki çift sayıların
        // toplamını ekrana yazdıran programı yazınız

/*
        int sum=0;
        for (int i=0;i<=20;i++){
            if (i%2==1){
                continue;
            }
            sum+=i;
        }
        System.out.println(sum);

 */

        // 1 den 100 e kadar 5 in katlarını ekrana
        // yazdıran programı
        //continue kullanarak yazdırın

/*
        for (int i = 0; i <=100 ; i++) {
            if (!(i%5==0)){
                continue;
            }
            System.out.print(i+" ");


            //   // Şifre tanımlayın ve kullanıcıya ekrandan
//// 5 defa şifreyi girmesini isteyin.
// Her bulamadığında şifre doğru değildir tekrar deneyin ikazı çıksın.
//// Şifreyi bulursa «tebrikler şifre doğru» yazısı gösterildikten sonra programdan çıkış işlemi gerçekleşsin.


        Scanner scan=new Scanner(System.in);
        String sifre="Harun123";
        int i=0;
        System.out.println("5 hakkınız var ");
        while (i<5){
            System.out.print(i+1+".Tahmin: ");
            String tahmin= scan.next();
            if (tahmin.equals(sifre)){
                System.out.println("tebrikler");
                break;
            }
            i++;
            if(i==5){
                System.out.println("hatalı,tahmin hakınız doldu");
                break;
            }
            System.out.println("tekrar deneyiniz");
        }
 */
        // 1-toplama 2-Çıkarma 3-çarpma 4-bölme 5-çıkış
        // çıkarma menüsüne hoş geldiniz
        // x:
        // y:
        // result;
        // menüden çıkmak için 0 işlemlere devam etmek için 1 giriniz
        Scanner scan=new Scanner(System.in);

        while (true){
            System.out.println("1-toplama 2-çıkartma 3-çarpma 4-bölme 5-çıkış: ");
            int tercih= scan.nextInt();
            if(tercih==1){
                while (true){
                    System.out.println("1.sayı: ");
                    int x= scan.nextInt();
                    System.out.println("2.sayı: ");
                    int y= scan.nextInt();
                    System.out.println("işlem sonucu: "+(x+y));
                    System.out.println("çıkış için 0 işleme devam etmek için 1 basınız");
                    int tercih2= scan.nextInt();
                    if(tercih2==1){
                        break;
                    }else if(tercih2==0){

                    }
                }
            }
        }

        }
    }

