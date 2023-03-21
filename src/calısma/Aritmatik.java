package calısma;

public class Aritmatik {
    public static void main(String[] args) {
      //  Bir musluğu A musluğu tek başına 12 saatte, B musluğu 30 saatte dolduruyor,
        // c musluğu ise dolu havuzu 9 saatte boşaltıyor.
     //   Buna göre bu 3 musluk birlikte açıldığında boş havuz kaç saatte dolar.

        int a=12;
        int b=30;
        int c=9;
        double a1=1/(double)a; // Bir saatte doldurduğu miktar
        double b1=1/(double)b;
        double c1=1/(double)c;

        double t=1/(a1+b1-c1);

        System.out.println("t = " + t);


    }
}
