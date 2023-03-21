package day16_Branching_Statements;

public class C03_NestedLoop_Breanching {
    public static void main(String[] args) {
/*
       outerLoop: for (int i = 0; i <3 ; i++) {
            System.out.print("A");
           innerLoop: for (int j = 0; j <5 ; j++) {
               System.out.print("B");
               harun:
               for (int k = 0; k <10 ; k++) {
                   System.out.print("C");
                   if(k==8){
                       continue outerLoop;
                   }
               }

            }

        }

 */
        for (int i = 0; i <= 100; i++) {
            if (i % 13 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
