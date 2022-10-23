package Complex;
public class TestComplex {
    public static void main(String[] args) {
        //d.kiểm tra các phương thức
        Complex sp1 = new Complex();
        sp1.nhap();
        System.out.print("So thuc thu 1: ");
        sp1.hienThi();
        Complex sp2 = new Complex();
        sp2.nhap();
        System.out.print("So thuc thu 2: ");
        sp2.hienThi();
        System.out.print("Tong 2 so thuc: ");
        sp1.congSP(sp2).hienThi();
        System.out.print("Hieu 2 so thuc: ");
        sp1.truSP(sp2).hienThi();
        System.out.print("Tich 2 so thuc: ");
        sp1.nhanSP(sp2).hienThi();
    }
}