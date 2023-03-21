package day17_Methods;

import java.util.Scanner;

public class C01_Banka_Question {
    public static void main(String[] args) {

        double money=2000;
        Scanner scan=new Scanner(System.in);
        while (true){
            System.out.println("1:Para ekle 2:para çek 3:bakiye 4:çıkış");
            System.out.println("yapmak istediğiniz işlemi seçiniz: ");
            int tercih= scan.nextInt();
            switch (tercih){
                case 1:
                    while (true) {
                        System.out.println("Eklemek istediğiniz tutarı girin:");
                        double para = scan.nextDouble();
                        money+=para;
                        System.out.println("bir üst menü için 1 basınız işleme devam etmek için 2");
                        int tercih2= scan.nextInt();
                        if (tercih2==1){
                            break;
                        } else if (tercih2==2) {
                            continue;
                        }else {
                            System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                        }
                    }
                   break;
                case 2:
                    while (true) {
                        System.out.println("çekmek istediğiniz tutarı girin:");
                        double para = scan.nextDouble();
                       if(para>money){
                           System.out.println("hesabınızda yeterli bakye yoktur");
                           continue ;
                       }
                       money-=para;
                        System.out.println("bir üst menü için 1 basınız işleme devam etmek için 2");
                        int tercih2= scan.nextInt();
                        if (tercih2==1){
                            break;
                        } else if (tercih2==2) {
                            continue;
                        }else {
                            System.out.println("Hatalı işlem yapıldığı için kart iade ediliyor");
                        }
                    }
            }
        }
    }
}
