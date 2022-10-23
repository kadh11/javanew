package Assigment02.ex01;
public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point();
        p.fromKeyboard();
        System.out.println(p);

        Point p1 = new Point();
        System.out.println("***********");
        System.out.println(p1);

        Point p2 = new Point(p);
        System.out.println("***********");
        System.out.println(p2);

        Point p3 = new Point(16.7,24.2);
        System.out.println("***********");
        System.out.println(p3);

        Point p4 = new Point(92,97,"F");
        System.out.println("***********");
        System.out.println(p4);
    }
}

