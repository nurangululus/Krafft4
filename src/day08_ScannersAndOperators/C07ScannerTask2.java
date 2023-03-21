package day08_ScannersAndOperators;
import java.util.Scanner;

public class C07ScannerTask2 {
    public static void main(String[] args) {


        //  Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //  Isminiz : Himmet
        //  Soyisminiz : Abi
        //  Yasiniz : 38
        //  Dogum Yeriniz: Kayseri
        //  Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("lütfen isminizi giriniz");
        String isim = scanner.nextLine();


        System.out.println("lütfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();



    }
}
