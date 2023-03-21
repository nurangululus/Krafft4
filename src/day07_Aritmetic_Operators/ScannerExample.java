package day07_Aritmetic_Operators;

import java.util.*;

public class ScannerExample {
    public static void main(String[] args) {

        //Ali fizik dersinden 92,
        // kimya dersinden 55,
        // matematik dersinden 89 almıştır.
        // Konsoldan bu değerleri kullanıcıya
        // girdirerek ekrana Ali’nin not ortalamasını yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.print("fizik: ");
        double f=scan.nextDouble();
        System.out.print("matematik: ");
        double m=scan.nextDouble();
        System.out.print("kimya: ");
        double k=scan.nextDouble();
        double ort=(f+m+k)/3;
        System.out.println("ort = " + ort);

    }
}
