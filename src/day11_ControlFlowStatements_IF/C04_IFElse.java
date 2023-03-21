package day11_ControlFlowStatements_IF;
import java.util.Scanner;
public class C04_IFElse {
    public static void main(String[] args) {
        //fizik kimya ve matematik notlarını konsoldan alsın
        //ortalama 80 üzerinde ise geçti yazsın
        // 80 ve altında ise kaldınız yazsın
        Scanner scan =new Scanner(System.in);
        System.out.println("ders adı giriniz");
        System.out.println("fizik notu girin");
        double f= scan.nextDouble();
        System.out.println("kimya notu girin");
        double k= scan.nextDouble();
        System.out.println("matematik notu girin");
        double m= scan.nextDouble();
        double ort=(f+k+m)/3;

        double gecmeNotu=80;
        if(ort>gecmeNotu){
            System.out.println("geçti");
        }else{
            System.out.println("kaldınız");
        }


    }



}
