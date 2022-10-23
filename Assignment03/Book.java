package Assignment03;

public class Book {
    private int bookID;
    private String bookTitle;
    private int amount;
    private int available;
    public Book(int _bookID, String _bookTitle, int _amount) {
        this.bookID = _bookID;
        this.bookTitle = _bookTitle;
        this.amount = _amount;
        this.available = _amount;
}
    public void showBookInfo() {
        System.out.println("Book ID: " + bookID);
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Book Amount: " + amount);
        System.out.println("Book Available: " + available);
    }
    public int getID() {
        return this.bookID;
    }
    public String getTitle() {
        return this.bookTitle;
    }
    public int getAmount() {
        return this.amount;
    }
    public int getAvailable() {
        return this.available;
    }
    public void setAvailable(int _available) {
        this.available = _available;
    }
}