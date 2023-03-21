package day5_revlewSecondiWeek;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //task 4
        //Kullanıcıdan 2 int değeişken  alınız ve
        //sayıların farklarının tek olduğunu
        //kontrol eden bir boolean değiken tanımlayınız.

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        int a= scan.nextInt();
        int b= scan.nextInt();

        boolean tekmi=(a-b)%2==1;
        System.out.println("tekmi = " + tekmi);


    }
}
