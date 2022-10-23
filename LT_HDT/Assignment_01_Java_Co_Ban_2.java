package LT_HDT;

import java.util.Scanner;

public class Assignment_01_Java_Co_Ban_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Double a, b, S;
        System.out.print("Nhap vao chieu dai hinh chu nhat a= ");
        a = scanner.nextDouble();
        System.out.print("Nhap vao chieu rong hinh chu nhat b= ");
        b = scanner.nextDouble();
        if(a==0 || b==0){
            System.out.println("a, b khong la 2 canh cua hinh chu nhat");
        } else {
            System.out.print("Dien tich hinh chu nhat la S= ");
            S = a*b;
            System.out.println(S);
        }
    }
}