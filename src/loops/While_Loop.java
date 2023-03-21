package loops;

public class While_Loop {
    public static void main(String[] args) {

        int i = 1; //initialization
        while (i<=4) {
            System.out.println("Hi"+i);
            int j=1;
                    while (j<=3){
                        System.out.println("hello");
                        j++;
            }
            i++;
        }
    //    System.out.println("Bye "+ i);
    }
}
