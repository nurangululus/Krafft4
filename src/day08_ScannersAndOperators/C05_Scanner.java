package day08_ScannersAndOperators;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        // 7 1. adım Scanner objesi oluşturalım
        Scanner scan =new Scanner  (System.in) ;

        //2.kullanıcıyı bilgilendirir,Ne istedigini söyleyin
        System.out.println("lütfen isminizi giriniz");

        //3/girilen bilgiyi içine koyabileceğiniz variable oluşturun
        //oluştordugunuz degişkenin içerisine.Scenner objesi ile

        String name=scan.nextLine();//
        System.out.println("name = " + name);

    }
}
