package day15_If_Else_Switch_Loops_Summary;

public class C02_If_Else_Example {
    public static void main(String[] args) {

        int not = 96;
        String str = "";
        if (not>=0&&not<40) {
            str = "F";
        } else if (not < 55) {
            str = "D";
        } else if (not < 70) {
            str = "C";
        }else if (not < 80) {
            str = "B";
        }else if (not>=85&& not<=100){
            str="A";
        }else {
            System.out.println("Hatalı giriş");
        }
    }
}
