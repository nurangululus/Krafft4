package day07_Aritmetic_Operators;

public class Aritmetic_Operators_2 {
    public static void main(String[]args){
      /*
        int x=4;
        int y=10;
        double z=(double)x/y;
        System.out.print(z);

        int dogumYil=1990;
        int yas=2023-dogumYil;
        int ahmetYas=yas-5;
        System.out.println("Ahmet yas = " + yas);

        double PI=3.14;
        double r=2;
        double alan=PI*r*r;
        double alan2=Math.PI*Math.pow(r,2);
        System.out.println("alan:"+alan);
        System.out.println("alan2:"+alan2);

        double cevre=2*PI*r;
        System.out.println("cevre = " + cevre);
        System.out.println("cevre = " +(2*PI*r));


        //300 Fahrenheit kaç Celcius 'dur?
        // (
       double f=300;
       double c=(f-32)/1.8;
       System.out.print((int)f+"fahrenheit "+c+" celciusdur");


        //Ali fizik dersinden 92,
       // kimya dersinden 55,
      // matematik dersinden 89 almıştır.
      //1.Ali’nin not ortalaması kaçtır?

        double f=92;
        double k=90;
        double m=89;
        double ort=(f+k+m)/3;
        System.out.println("ort = " + ort);
        boolean isPas=(ort>80);
        System.out.print("Ali sınıfı geçti mi:"+(ort>=80));*/


        int sira=15;
        int siraKoltukAdet=12;
        int katilimciSayisi=113;
        //1.Toplantı salonu toplam kapasitesi nedir?
        int kapasite=sira*siraKoltukAdet;

        //2.kaç adetbos koltuk vardır?
        int bosKoltukAdet=kapasite-katilimciSayisi;

        //3.kac adet sırada oturulmaktadır?
        int oturulanSiraAdet=katilimciSayisi/siraKoltukAdet;

        //4.kaç sıra tamamen boş kalmıştır?
        int bosSiraAdet=sira-oturulanSiraAdet;

        //5.oturulan sıralarda kaç adet boş koltuk vardır?





    }
}
