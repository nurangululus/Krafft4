package day11_ControlFlowStatements_IF;
import java.util.Scanner;

public class C07_If_Else_Odev {
    public static void main(String[] args) {
        //Bir program yazın
        // 3 tane numara kabul etsin ve büyük olanı versin.(homework)
       // 2 veya 3 farklı yol ile çözmeye çalışın

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 numara giriniz");
        System.out.print("num1 : ");
        int s1=scan.nextInt();
        System.out.print("num2 : ");
        int s2=scan.nextInt();
        System.out.print("num3 : ");
        int s3=scan.nextInt();

        if ((s1>s2)&&(s1>s3)){
            System.out.println("En büyük sayı :"+s1);
        }else if((s2>s1)&&(s2>s3)){
            System.out.println("En büyük sayı :"+s2);
        }else {
            System.out.println("En büyük sayı :"+s3);
        }



    }
}
