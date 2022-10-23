package Complex;
import java.util.Scanner;

class Complex {
    // Thuoc tinh
    private double pThuc;
    private double pAo;

    public double getPThuc() {
        return this.pThuc;
    }

    public void setPThuc(double pThuc) {
        this.pThuc = pThuc;
    }

    public double getPAo() {
        return this.pThuc;
    }

    public void setPAo(double pAo) {
        this.pAo = pAo;
    }

    // Khởi tạo mặc định, không tham số (phần ảo, thực bằng 0)
    public Complex() {
        setPThuc(0);
        setPAo(0);
    }

    public Complex(double pThuc, double pAo) {
        setPThuc(pThuc);
        setPAo(pAo);
    }

    // Ham nhap so phuc
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao phan thuc: ");
        double a = sc.nextDouble();
        System.out.print("Nhap vao phan ao: ");
        double b = sc.nextDouble();
        setPThuc(a);
        setPThuc(b);
    }

    // Ham cong 2 so phuc
    public Complex congSP(Complex sp2) {
        double thuc = getPThuc() + sp2.pThuc;
        double ao = getPAo() + sp2.pAo;
        return new Complex(thuc, ao);
    }



    // Ham tru 2 so phuc
    public Complex truSP(Complex sp2) {
        double thuc = getPThuc() - sp2.pThuc;
        double ao = getPAo() - sp2.pAo;
        return new Complex(thuc, ao);
    }

    // Ham nhan 2 so phuc
    // (a + bi)(c + di) = (ac - bd) + (ad + bc)i
    public Complex nhanSP(Complex sp2) {
        double thuc = getPThuc()*sp2.pThuc - getPAo()*sp2.pAo;
        double ao = getPThuc()*sp2.pAo + getPAo()*sp2.pThuc;
        return new Complex(thuc, ao);
    }

    // Ham hien thi so phuc
    public void hienThi() {
        double a = getPThuc();
        double b = getPAo();
        if (b < 0) {
            System.out.println(a + " - " + Math.abs(b) + "*i");
        } else {
            System.out.println(a + " + " + b + "*i");
        }
    }
}

