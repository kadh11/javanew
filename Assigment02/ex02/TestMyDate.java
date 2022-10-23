package Assigment02.ex02;

public class TestMyDate {

    public static  void main(String[] args) {
        MyDate myDate = new MyDate();
        do {
            myDate.nhap();
            myDate.hienThi(myDate);
        } while (true);
    }
}

