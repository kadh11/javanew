package Bai_Mau;

// So sanh hai chuoi

import java.util.Scanner;

public class BT94 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        String str1;
        String str2;
        System.out.println("Nhap vao hai chuoi str1: ");
        str1 = scanner.nextLine();
        System.out.println("Nhap vao hai chuoi str2: ");
        str2 = scanner.nextLine();
        // So sanh va ket luan
        var result=str1.compareTo(str2);
        if(result<0){
            System.out.println("str1 dung truoc str2");
        } else if (result==0){
            System.out.println("str1 tuong duong str2");
        }else {
            System.out.println("str1 dung sau str2");
        }
    }
}
