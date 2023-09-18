import java.util.Scanner;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        BookDAO dao = new BookDAO();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an operation:");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter book ISBN: ");
                    String isbn = scanner.nextLine();
                    dao.addBook(new Book(0, name, isbn)); // ID 0 because it's auto-incremented in the DB
                    break;

                case 2:
                    List<Book> books = dao.getAllBooks();
                    for (Book book : books) {
                        System.out.println(book);
                    }
                    break;

                case 3:
                    System.out.print("Enter book ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline
                    System.out.print("Enter new book name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new book ISBN: ");
                    String newIsbn = scanner.nextLine();
                    dao.updateBook(updateId, newName, newIsbn);
                    break;

                case 4:
                    System.out.print("Enter book ID to delete: ");
                    int deleteId = scanner.nextInt();
                    dao.deleteBook(deleteId);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
