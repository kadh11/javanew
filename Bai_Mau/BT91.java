package Bai_Mau;

// Kiem tra chan le

import java.util.Scanner;

public class BT91 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao mot so nguyen n: ");
        n = scanner.nextInt();
        if(n % 2 == 0) {
            System.out.println(" Chan ");
        }else {
            System.out.println(" Le ");
        }
    }
}
