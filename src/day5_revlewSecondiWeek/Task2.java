package day5_revlewSecondiWeek;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //        Task 2
        // Kullanıcıdan bir sayı alın
        //sayı cift sayı mı olduğunu bir boolean değişkeni ile kontrol edin

        Scanner scan =new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int i= scan.nextInt();
       // boolean ciftmi=(i%2==0);
        boolean çiftmi=(i%2==1);

        System.out.println("ciftmi = " + çiftmi);

    }
    }




