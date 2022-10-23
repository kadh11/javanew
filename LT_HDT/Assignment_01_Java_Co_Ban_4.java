package LT_HDT;

import java.util.Scanner;

public class Assignment_01_Java_Co_Ban_4 {
    public static void main(String[] args) {
        double SoNuoc, SoTien;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap Vao So Nuoc: ");
        SoNuoc= scanner.nextDouble();
        SoTien=0;
        if(SoNuoc<=10){
            SoTien=SoNuoc*5973;
            System.out.println("So Tien Nuoc La:"+SoTien+"VND");
        }else{
            if(SoNuoc<=20){
                SoTien=(10*5973+(SoNuoc-10)*7052);
                System.out.println("So Tien Nuoc La:"+SoTien+"VND");
            }else{
                if(SoNuoc<=30){
                    SoTien=(10*5973+10*7052+(SoNuoc-20)*8669);
                    System.out.println("So Tien Nuoc La:"+SoTien+"VND");
                }else{
                    if(SoNuoc>30){
                        SoTien=(10*5973+10*7052+10*8669+(SoNuoc-30)*15929);
                        System.out.println("So Tien Nuoc La:"+SoTien+"VND");
                    }
                }
            }
        }
        System.out.println("So Tien Sau Thue La:"+SoTien*1.05+"VND");
    }
}
