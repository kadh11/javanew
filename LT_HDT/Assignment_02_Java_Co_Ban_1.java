
/* Tạo một lớp biểu diễn điểm trong mặt phẳng (Point) gồm các thuộc tính: Tên điểm (Chuỗi ký tự ví dụ: “A”, “BB”, “C”…), Hoành độ (số thực), Tung độ (số thực).
public class point {
private string tenDiem;
private float hoanhDo;
private float tungDo;

// Viết các phương thức get/set cho lớp Point
public point();

    public string getTenDiem() {
        return tenDiem;
    }

    public void set HoanhDo(float hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public void setTungDo(float tungDo) {
        this.tungDo = tungDo;
    }

// Viết các phương thức khởi tạo sau
// Phương thức khởi tạo không có tham số nào: Gán cho hoành độ và tung độ = 0, tên điểm mặc định là “A”.

    public point (){
        getTenDiem("A");
        setHoanhDo(0.0);
        setHoanhDo(0.0);
    }

// Phương thức khởi tạo nhận hai số thực làm tham số

    public point(float tungDo, float hoanhDo){
        getTenDiem("Noname");
        setTungDo(tung);
        setHoanhDo(hoanh);
    }
}*/

