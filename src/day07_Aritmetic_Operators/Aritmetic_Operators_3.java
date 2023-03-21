package day07_Aritmetic_Operators;

public class Aritmetic_Operators_3 {
    public static void main(String[] args) {
      /*  //4500dk kaç saattir?
        int dk=4500;
        int saat=4500/60;
        System.out.println("saat = " + saat);

        //4321dk saat dk ve saniye
        //cinsine çevrildikten sonra ekrana yazınız?

        System.out.println(4321%60);*/

        int toplamSaniye=31502;
        // 60 * 60sn=1 saat
        int saat=toplamSaniye/3600;
        //int dakika=(toplamSaniye-saat*3600)/60;
        int dakika= toplamSaniye%3600/60;
        int saniye=toplamSaniye%60;
        System.out.println("saat " +dakika+"dakika"+saniye+ saniye);


    }
}
