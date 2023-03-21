package day17_Methods;

import java.util.Random;
import java.util.Scanner;

public class C02_Tahmin_Oyunu {
    public static void main(String[] args) {

        // Bilgisayarın tuttuğu 0 dahil 50 arası
        // sayıyı 5 hamlede bulma
        //tuttuğu sayıdan düşük bir tahmin yaparsak yukarı
        //tuttuğu sayıdan yüksek bir tahmin yaparsak aşağı

        Random random=new Random();
        int sayi= random.nextInt(50);
        System.out.println(sayi);


    }
}
