package Bai_Mau;

//Kiem tra ky tu dau va cuoi cua chuoi co trung nhau khong

import java.util.Scanner;

public class BT98 {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in);
        System.out.println("Enter your String: ");;
        var str=scanner.nextLine();
        // Check and print result
        if(str.charAt(0)==str.charAt(str.length()-1)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
