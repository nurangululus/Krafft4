package day12_SwitchCase;

public class C06_Switch_case {
    public static void main(String[]args){
        System.out.println("giriş");
        int sayi=1;

        switch (sayi){
            case 1:
                System.out.println("A");

            case 2:
                System.out.println("sayi 2 ye eşittir");
                break;
            case 3:
                System.out.println("sayi 3 e eşittir");
                break;
            default:
                System.out.println("sayı eşleşmedi");
        }
    }
}
