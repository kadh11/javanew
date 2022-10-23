package Assignment03;
import java.util.ArrayList;
import  java.util.Scanner;

public class Library {
    private String libraryName;
    private ArrayList<Book> bookList = new ArrayList<>();
    private int numberOfBooks;
    public static final int MAX_NUMBER_BOOKS = 100;
    public Library(String _libraryName) {
        this.libraryName = _libraryName;
    }
    public void showLibraryInfo() {
        this.numberOfBooks = this.bookList.size();
        System.out.println("\n1. Show library information");
        System.out.println("-----------------------------------------");
        System.out.println("Library Name: " + this.libraryName);
        System.out.println("Number of book: " + this.numberOfBooks);
        for (int i = 0; i < this.numberOfBooks; i++) {
            System.out.println("No." + (i+1) + ": ");
            this.bookList.get(i).showBookInfo();
        }
    }
    public void addNewBook() {
        int length = this.bookList.size();
        boolean check = true;
        if (length == MAX_NUMBER_BOOKS)
            System.out.println("FULLS OF BOOKS! PLEASE TRY AGAIN LATER !");
        else {
            Scanner newBook = new Scanner(System.in);
            System.out.println("\n2. Add new book");
            System.out.println("-----------------------------------------");
            System.out.println("Enter book's information:");
            System.out.print("(1)Book ID (number only): ");
            int bookID = newBook.nextInt();
            newBook.nextLine();
            System.out.print("(2)Book Title: ");
            String bookTitle = newBook.nextLine();
            System.out.print("(3)Amount: ");
            int bookAmount = newBook.nextInt();
            for (int i = 0; i < length; i++) {
                if (bookList.get(i).getID() == bookID){
                    System.out.println("THIS ID IS EXIST! PLEASE TRY AGAIN LATER");
                    check = false;
                    break;
                }
            }
            if (check == true) {
                Book _NewBook = new Book(bookID, bookTitle, bookAmount);
                bookList.add(_NewBook);
            }
        }
    }
    public void findBook() {
        int length = this.bookList.size();
        boolean check = false;
        Scanner findBook = new Scanner(System.in);
        System.out.println("\n3. Find book");
        System.out.println("-----------------------------------------");
        System.out.print("Enter book's ID: ");
        int bookID = findBook.nextInt();
        for (int i = 0; i < length; i++) {
            if (bookList.get(i).getID() == bookID) {
                System.out.println("Book Title: " + bookList.get(i).getTitle());
                System.out.println("Book ID: " + bookID);
                System.out.println("Total Amount: " + bookList.get(i).getAmount());
                System.out.println("Left Amount: " + bookList.get(i).getAvailable());
                check = true;
                break;
            }
        }
        if (check == false)
            System.out.println("THIS ID IS DOESN'T EXIST! PLEASE TRY AGAIN LATER!");
    }
    public void borrowBook() {
        int length = this.bookList.size();
        Scanner borrowBook = new Scanner(System.in);
        System.out.println("\n4. Borrow book");
        System.out.println("-----------------------------------------");
        System.out.print("Enter book's ID: ");
        int bookID = borrowBook.nextInt();
        for (int i = 0; i < length; i++) {
            if (bookList.get(i).getID() == bookID) {
                System.out.println("Book Title: " + bookList.get(i).getTitle());
                System.out.println("Book ID: " + bookID);
                System.out.println("Total Amount: " + bookList.get(i).getAmount());
                System.out.println("Left Amount: " + bookList.get(i).getAvailable());
            }
            if (bookList.get(i).getAvailable() > 0) {
                bookList.get(i).setAvailable(bookList.get(i).getAvailable() - 1);
                System.out.println("\nTHE BOOK IS BORROWED SUCCESSFULLY!");
                System.out.println("Book Title: " + bookList.get(i).getTitle());
                System.out.println("Book ID: " + bookID);
                System.out.println("Total Amount: " + bookList.get(i).getAmount());
                System.out.println("Left Amount: " + bookList.get(i).getAvailable());
            }
            break;
        }
    }
    public void returnBook() {
        int length = this.bookList.size();
        Scanner returnBook = new Scanner(System.in);
        System.out.println("\n5. Return a book");
        System.out.println("-----------------------------------------");
        System.out.print("Enter book's ID: ");
        int bookID = returnBook.nextInt();
        for (int i = 0; i < length; i++) {
            if (bookList.get(i).getID() == bookID) {
                bookList.get(i).setAvailable(bookList.get(i).getAvailable() + 1);
                System.out.println("\nTHE BOOK IS RETURNED SUCCESSFULLY!");
                System.out.println("Book Title: " + bookList.get(i).getTitle());
                System.out.println("Book ID: " + bookID);
                System.out.println("Total Amount: " + bookList.get(i).getAmount());
                System.out.println("Left Amount: " + bookList.get(i).getAvailable());
                break;
            }
        }
    }
}
