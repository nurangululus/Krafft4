package loops;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        // girilen 1.vize

        Scanner input=new Scanner(System.in);
        System.out.println("1.Vize notunu giriniz : ");
        double vizeNotu1= input.nextDouble();
        System.out.println("2.Vize notunu giriniz : ");
        double vizeNotu2= input.nextDouble();
        System.out.println("Final notunu giriniz : ");
        double FinalNotu= input.nextDouble();

        double ort=vizeNotu1*0.2+vizeNotu2*0.2+FinalNotu*0.6;
        System.out.println("ort ="+ ort);

        if (ort>=90){
            System.out.println("A");
        }
        else if(ort>=80){
            System.out.println("B");
        }
        else if(ort>=70){
            System.out.println("C");
        }
        else if(ort>=60){
            System.out.println("D");
        }
        else if(ort>=40){
            System.out.println("E");
        }
        else {
            System.out.println("F");
        }
    }
}
