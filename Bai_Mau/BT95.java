package Bai_Mau;

// Kiem tra 3 canh cua mot tam giac

import java.util.Scanner;

public class BT95 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in); // Khai bao bien scanner
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        var a=scanner.nextDouble(); // Khai bao bien a co kieu du lieu Double
        var b=scanner.nextDouble();
        var c=scanner.nextDouble();
        // Kiem tra va dua ra ket luan
        if(a<=0 || b<=0 || c<=0){
            System.out.println("Khong la 3 canh cua mot tam giac");
        } else if((a+b)>c&&(a+c)>b&&(b+c)>a){
            System.out.println("La 3 canh cua mot tam giac");
        }else {
            System.out.println("Khong la 3 canh cua mot tam giac");
        }
    }
}
