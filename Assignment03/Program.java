package Assignment03;
import java.util.Scanner;
public class Program {
    private static int optionID;
    public static void showMenu() {
        System.out.println("=========== Main menu ==========");
        System.out.println("1. Show library information");
        System.out.println("2. Add new book");
        System.out.println("3. Find book");
        System.out.println("4. Borrow book");
        System.out.println("5. Return a book");
        System.out.println("6. Exit");
        System.out.println("================================");
        System.out.print("Enter menu ID (1-6): ");
    }
    public static void askOption() {
        Scanner option = new Scanner(System.in);
        int _optionID = option.nextInt();
        optionID = _optionID;
    }
    public static int getOptionId(){
        return optionID;
    }
    public static void main(String[] args) {
        String libraryName = "Library of Bach Khoa Ward";
        Library library = new Library(libraryName);
        while (true) {
            showMenu();
            askOption();
            int id = getOptionId();
            if (id == 1) library.showLibraryInfo();
            else if (id == 2) library.addNewBook();
            else if (id == 3) library.findBook();
            else if (id == 4) library.borrowBook();
            else if (id == 5) library.returnBook();
            else {
                System.out.println("THANK YOU FOR USING THIS PROGRAM! SEE YOU AGAIN!");
                break;
            }
            System.out.println("\n");
        }
    }
}
