package BTTH;

// Vẽ hình chư nhật bằng dấu * rồi in ra viền

import java.util.Scanner;

public class B1_2 {
    public static void main(String[] args) {
    /*int m, n;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter m: ");
    m= scanner.nextInt();
    System.out.print("Enter n: ");
    n= scanner.nextInt();*/
    var scanner=new Scanner(System.in);
    System.out.print("Enter m: ");
    var m=scanner.nextInt();
    System.out.print("Enter n: ");
    var n=scanner.nextInt();
    for(int i=0; i<m; i++){
        for(int j=0; j<n; j++){
            if(i==0||j==0||i==m-1||j==n-1){ // Chỉ số m, n chạy từ 1 đến m, n; chỉ số i, j chạy từ 0 đến m-1, n-1
                System.out.print(" * ");
            }else {
                System.out.print("   ");
                }
            }
        System.out.println();
        }
    }
}
