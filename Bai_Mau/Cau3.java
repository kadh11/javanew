package Bai_Mau;

public class Cau3 {
    static int m(int i) {
        System.out.printf(i + ", ");
        return i;
    }

    public static void main(String[] args) {
        m(m(1) + m(2) % m(3) * m(4));
    }
}
