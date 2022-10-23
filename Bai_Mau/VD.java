package Bai_Mau;

public class VD {
    public static void main(String[] args) {
        String s = "ab" + "12";
        String t = "ab" + 12;
        String u = new String("ab12");
        System.out.printf((s==t) + " " + (s==u));
    }
}
