package day15_If_Else_Switch_Loops_Summary;

import java.util.Scanner;

public class C04_Switch_Case_Exaple {
    public static void main(String[] args) {
        //byte,short,int,char,String
/*
        int x=5;

        switch (x){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            case 5:
                System.out.println("E");
                break;
                  }
 */

        // et menü,sebze menü,çocuk menü (1-2-3)
        //et menü pirzola,tavuk
        // sebze menü enginar 30,roka salatası 40
        // çocuk menü patates

        Scanner scan=new Scanner(System.in);
        System.out.print("et menü,sebze menü,cocuk menü (1-2-3): ");
        int tercih_1= scan.nextInt();
        switch (tercih_1){

            case 1:
                System.out.println("pirzola mı (1) tavuk mu (2): ");
                int tercih_2= scan.nextInt();
                switch (tercih_2){

                }
        }
    }
}
