package logicalOperators_If;
import java.util.Scanner;
public class TaskSwitch {
    public static void main(String[] args) {
        // Girilen 1vize(%20), 2vize(%20)ve final(%60) notunu okuyarak ortalamayı bulunuz
        // Soru : Kullanıcıdan  Fizik: 90   şeklinde not bilgisini alınız.
        // >= 90 için A
        // >= 80 için B
        // >= 70 için C
        // >= 60 için D
        // >= 40 için E
        // < 40 için F yazdırınız.

// Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.


        Scanner oku = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = oku.nextInt();

        int onlar=(sayi/10)%10;


        switch (onlar){
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("iki");
                break;
        }




    }
}
