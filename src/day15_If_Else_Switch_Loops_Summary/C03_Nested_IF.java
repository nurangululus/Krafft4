package day15_If_Else_Switch_Loops_Summary;

public class C03_Nested_IF {
    public static void main(String[] args) {

        // alinin cebinde 100 tl var ise va zamanıda varsa sinemaya gitsin
        // 100 tl si yoksa evde kalsın

        int aliParasi=120;
        boolean zaman=true;

        if(aliParasi>=100){
            if (zaman){
                System.out.println("sinemaya gidebilir");
            }else {
                System.out.println("parası var ama zamanı yok gidemez");
            }
                }else {
            System.out.println("parası yok gidemez");
        }
    }
}
