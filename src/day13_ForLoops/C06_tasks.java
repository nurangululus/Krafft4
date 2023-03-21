package day13_ForLoops;

public class C06_tasks {
    public static void main(String[] args) {
       //Bir program yazın ve [0-100]arasındaki tüm sayıları yazdırsın
        for (int i=0 ;i<=100;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------");

        //Bir program yazın ve [15-100]arasındaki tüm sayıları yazdırsın
       for (int i=15; i<=100; i++){
           System.out.print(i+" ");
       }
        System.out.println();
        System.out.println("---------------------");

        //0 dan 100 e kadar olan sayıları tersten ekrana yazdırın.
       for (int i=100; 0<= i;i--){

           System.out.print(i+" ");

           System.out.println();
           System.out.println("---------------------");

          // for (int i=1; i<=100; i++){
            //   if (i%2==1){
              //     System.out.println(i+" ");
           }


          //  for (int i=23; i<=50; i++) {
             //   System.out.println(i+"c = "+(i*1.8+32)+"Ftfgvb ");

                //Örnek: 9 sayısının çarpı tablosunu yazdırınız.

                for (int i=1; i<=10;i++ ){
                    System.out.println("9 X "+i+" = "+9*i);

                }
            }

       }


