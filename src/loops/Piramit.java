package loops;

import java.util.Scanner;

public class Piramit {
    public static void main(String[] args) {

        //Piramit
/*
        for (int i=5; i>0;i--){
            for (int j=1; j<i ;j++){
                System.out.print(" ");
            }
           for (int k=6-i; k<5; k--){
                System.out.print("* ");
            }
            System.out.println();
        }

 */
        Scanner scan=new Scanner(System.in);
        boolean flag=true;


        while (flag){
            System.out.print("x: ");
            int x=scan.nextInt();
            System.out.print("y: ");
            int y= scan.nextInt();
            int result=x+y;
            if(result>=25){
                flag=false;
                System.out.println("Toplam 25'eşit veya büyük olduğu için programdan çıkılıyor.");
            }else{
                System.out.println("toplam: "+result);
            }
        }
    }
}
