package Assigment02.ex01;
import java.util.Scanner;

class Point {
    private double x;
    private double y;
    private String name;

    public Point() {
        this.name = "A";
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point(double x, double y) {
        this.name = "A";
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
        this.name = point.getName();
    }

    public void fromKeyboard() {
        Scanner sc = new Scanner(System.in);
        SysOtem.out.print("X = ");
        this.x = sc.nextDouble();
        System.out.print("Y = ");
        this.y = sc.nextDouble();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+"("+this.x+","+this.y+")";
    }
}
