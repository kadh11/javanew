package Bai_Mau;

// Kien tra ky tu dau co viet hoa khong

import java.util.Scanner;

public class BT97 {
    public static void main(String[] args) {
        var scanner=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        var fullName=scanner.nextLine().trim(); // đoạn code "trim()" là để cắt các dấu cách thừa trước và sau chuổi họ-đệm-tên đang xét
        // Check and Print Result


        // Hai câu lện var bê dưới là
        // Câu var thứ nhất: tìm ra vị trí dấu cách cuối
        // Câu var thứ hai: là tách chuối ký tự sau dấu cách ra tức là tách riêng tên ra ngoài
        var lastSpaceIndex=fullName.lastIndexOf( " " );
        var firstName=fullName.substring(lastSpaceIndex + 1); //Hàm SUBSTRING trong SQL Server cho phép bạn trích xuất một chuỗi con có độ dài được chỉ định bắt đầu từ một vị trí trong chuỗi đầu vào
        //lastSpaceIndex + 1: là tính từ ký tự sau dấu cách cuối tưức là tên của bạn (DĐiều kiện giữ họ, đệm v tên chỉ có 1 dấu cách suy ra dấu cách cuối là dấu cách trước tên)
        if(firstName.matches( "^[A-Z].*")){ //Dùng regex: "^[A-Z].*": Để kiểm tra ký tự viết hoa
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
