package day12_SwitchCase;
import java.util.Scanner;

public class C04_Nested_If {
    public static void main(String[] args) {

       Scanner scan=new Scanner(System.in);
        System.out.println("yaşınız: ");
        int age=scan.nextInt();

        if (age>=18){
            System.out.println("Yanınızda bayan var mı Evet/Hayır: ");
            String yanit= scan.next();
            if(yanit.equals("Evet")){
                System.out.println("Hoş geldiniz");
            }else{
            System.out.println("Yanınızda bayan olmadığı için giremezsiniz");
            }
        }else{
            System.out.println("Giremezsiniz");
        }

    }
}
