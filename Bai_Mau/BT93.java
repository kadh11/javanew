package Bai_Mau;

// Chuỗi họ tên hợp lệ

import java.util.Scanner;

public class BT93 {
    public static void main(String[] args) {
        /*String name;*/
        var scanner = new Scanner(System.in); //Khai bao bien scanner (sau var)
        System.out.println("Nhap vao chuoi ho ten can kiem tra: ");
        /*Scanner scanner=new Scanner(System.in);
        name= scanner.nextLine();*/
        var name=scanner.nextLine();

        // Kiem tra va in ra ket luan
        if(name.matches( "^[a-zA-Z\\s]+$")) { // Kiểm tra chuỗi họ tên có hợp lệ không: tức là chỉ gồm ký tự viết hoa-ký tự thường-dấu cách
            System.out.println("Hop Le");
        } else {
            System.out.println("Khong Hop Le");
        }
    }
}
