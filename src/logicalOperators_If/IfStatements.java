package logicalOperators_If;

public class IfStatements {
    public static void main(String[] args) {
/*
        int x=28;
        if (x>18 && x<=20)
            System.out.println("hello");
        System.out.println("ahmet");
        else
            System.out.println("bye");

 */
        int x = 8;
        int y = 11;
        int z = 6;

        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
