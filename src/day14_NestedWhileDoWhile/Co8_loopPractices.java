package day14_NestedWhileDoWhile;

public class Co8_loopPractices {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("---------------------------");
        int j = 1;
        while (j <= 10) {
            System.out.print(j);
            j++;
        }
        System.out.println("--------------------");

        int k = 1;
        do {
            k++;
            System.out.println(k);
        }while(k<=10);

    }
}
