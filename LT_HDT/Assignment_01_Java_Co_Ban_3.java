package LT_HDT;

import java.util.Scanner;

public class Assignment_01_Java_Co_Ban_3 {
    public static void main(String[] args) {
        float a, b, c, Delta, x, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao a= ");
        a = scanner.nextFloat();
        System.out.print("Nhap vao b= ");
        b = scanner.nextFloat();
        System.out.print("Nhap vao c= ");
        c = scanner.nextFloat();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem!");
                } else {
                    System.out.println("Phuong trinh vo nghiem!");
                }
            } else {
                x = -c / b;
                System.out.println("Phuong trinh co nghiem duy nhat la x=" + x);
            }
        } else {
            Delta = b * b - 4 * a * c;
            if (Delta < 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                if (Delta == 0) {
                    x = -b / (2 * a);
                    System.out.println("Phuong trinh co nghiem kep la x1=x2=" + x);
                } else {
                    x1 = (float) (-b + Math.sqrt(Delta)) / (2 * a);
                    x2 = (float) (-b - Math.sqrt(Delta)) / (2 * a);
                    System.out.println("Nghiem cua phuong trinh la x1=" + x1);
                    System.out.println("Nghiem cua phuong trinh la x2=" + x2);
                }
            }
        }
    }
}
