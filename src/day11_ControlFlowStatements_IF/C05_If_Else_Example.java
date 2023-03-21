package day11_ControlFlowStatements_IF;
import java.util.Scanner;

public class C05_If_Else_Example {
    public static void main(String[] args) {

       /* double sicaklik=19.9;
        if(sicaklik>=20){
            System.out.println("hava sıcak");
        }else{
            System.out.println("hava soğuk");
        }

        */

//kullanıcıdan bir tam sayı alın
        // ekrana tekmi çift mi olduğunu
        // yazdıran programı yazın

         Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int number= scan.nextInt();
        boolean result=(number%2==0);
        if(result){
            System.out.println("Cift");
        }else{
            System.out.println("Tek");
        }

    }
}
