package Bai_Mau;

// Kiem tra chuoi co bat dau boi khoang trang khong

import java.util.Scanner;

public class BT96 {
    public static void main(String[] args) {
        var scanner =new Scanner(System.in);
        System.out.println("Nhap vao mot str: ");
        var str = scanner.nextLine();
        // Kiem tra va in ra ket qua
        if(str.startsWith(" "))
        /*if(str.matches(regex: "^\\s+.*"))*/
            {
            System.out.println("YES");
        } else {
            System.out.println("No");
        }
    }
}
