package Bai_Mau;

// Tinh dien tich hinh thang

import java.util.Scanner;

public class BT99 {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in); // Khai bao bien scanner
        System.out.println("Nhap vao day lon day nho chieu cao hinh thang: ");
        var a=scanner.nextDouble();
        var b=scanner.nextDouble();
        var h=scanner.nextDouble();
       /* Double a;
        Double b;
        Double h;
        a=scanner.nextDouble();
        b= scanner.nextDouble();
        h= scanner.nextDouble();*/
        // Check and Print Result
          if(a>0 && b>0 && h>0){
              System.out.print("Dien tich cua hinh thang la: ");
              double area = (a+b)*h/2;
              System.out.println(area);
          }else {
              System.out.println("INVALID INPUT");
          }
;    }
}
