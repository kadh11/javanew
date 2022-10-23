package BTTH;

// Vẽ hình chữ nhật bằng dấu *

import java.util.Scanner;

public class B1_1 {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in); // Khai báo biến scanner
        System.out.print("Nhap m: ");
        var m= scanner.nextInt(); // Gộp chung khai báo biến và kiểu dữ liệu của m qua biến scanner bằng var ở trên
        System.out.print("Nhap n: ");
        var n=scanner.nextInt();
      /*  int m;
        int n; // Khai báo kểu dữ liệu của m và n
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap vao m: ");
        m=scanner.nextInt(); // Khai báo biến n
        System.out.print("Nhap vao n: ");
        n=scanner.nextInt();*/ // Khai báo biến n
        // Kiểu này sẽ không có: import java.util.Scanner;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(" * "); // Không in xuống dòng vì là dòng ngang của vòng lặp trong
            }
            System.out.println(); // In xuống dòng vì đây là cột đứng của vòng lặp ngoài
        }
    }
}
