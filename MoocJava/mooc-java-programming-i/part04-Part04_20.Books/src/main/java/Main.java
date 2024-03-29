
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int numPages = Integer.valueOf(scanner.nextLine());

            System.out.println("Publication year: ");
            String year = scanner.nextLine();

            books.add(new Book(title, numPages, year));
        }

        System.out.println("What information will be printed?");
        String userInput = scanner.nextLine();

        for (Book book : books) {
            if (userInput.equals("everything")) {
                System.out.println(book);
            } else if (userInput.equals("name")) {
                System.out.println(book.getTitle());
            }
        }

    }
}
