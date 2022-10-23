package Assigment02.ex02;

import java.util.Scanner;

public class MyDate {
    private int Date;
    private int Month;
    private int Year;

    public MyDate() {
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int date) {
        this.Date = date;
    }

    public int getMonth() {
        return Month;
    }

    public boolean setMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("Nhập tháng chưa hợp lệ.");
            return false;
        } else {
            this.Month = month;
            return true;
        }
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        if (year < 0) {
            System.out.println("Nhập năm chưa hợp lệ");
        }
        this.Year = year;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        boolean validateYear = false;
        boolean validateMonth = false;
        boolean validateDate = false;

        while (!validateYear) {
            System.out.print("Nhập năm: ");
            int y = sc.nextInt();
            if (validateYear(y)) {
                setYear(y);
                validateYear = true;
            } else {
                System.out.println("Nhập năm chưa hợp lệ");
            }
        }

        while (!validateMonth) {
            System.out.print("Nhập tháng: ");
            int m = sc.nextInt();
            if (validateMonth(m)) {
                setMonth(m);
                validateMonth = true;
            } else {
                System.out.println("Nhập tháng chưa hợp lệ");
            }
        }

        while (!validateDate) {
            System.out.print("Nhập ngày: ");
            int d = sc.nextInt();
            if (validateDate(d)) {
                setDate(d);
                validateDate = true;
            } else {
                System.out.println("Nhập ngày chưa hợp lệ");
            }
        }
    }
    public boolean validateYear (int year){
        return year >= 0;
    }
    public boolean validateMonth (int month) {
        return month >= 0 && month <= 12;
    }
    public boolean validateDate(int date) {
        switch (this.Month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (date > 31 || date < 0) {
                    return false;
                } else {
                    return true;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                if (date > 30 || date < 0) {
                    return false;
                } else {
                    return true;
                }

            case 2:

                if ((this.Year % 4 == 0 && this.Year % 100 != 0) || (this.Year % 400 == 0)) {
                    if (date > 29 || date < 0) {
                        return false;
                    } else {
                        return true;
                    }
                } else {
                    if (date > 29 || date < 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            default:
                return false;
        }
    }

    public void hienThi(MyDate myDate) {
        System.out.println(myDate.getDate() + "/" + myDate.getMonth() + "/" + myDate.getYear());
    }
}
