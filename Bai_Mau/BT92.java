package Bai_Mau;

// So sanh hai so nhap tu ban phim

import java.util.Scanner;
public class BT92 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Double number1; // Nhap vao hai so thuc
        Double number2;
        // System.out.println("nhập vào hai số thực cách nhau bởi dấu cách: ");
        System.out.println("Nhập vào hai số thực a: "); //Giống: cout hay printf
        number1= scanner.nextDouble(); // Giống: cin hay scanf
        System.out.println("Nhập vào hai số thực b: ");
        number2= scanner.nextDouble();
        // Hiển thị kết quả
        if (number1 < number2){
            System.out.println(number1 + " < " + number2);
        }else if(number1 == number2){
            System.out.println(number1 + " = " + number2);
        }else{
            System.out.println(number1 + " > " + number2);
        }
    }
}
