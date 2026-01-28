package No1;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Display Books");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    Book book = new Book(id, title, author, true);
                    library.addBook(book);
                    break;

                case 2:
                    System.out.print("Enter Book ID to search: ");
                    int searchId = sc.nextInt();
                    Book found = library.searchBook(searchId);
                    if (found != null) {
                        found.displayBook();
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID to remove: ");
                    int removeId = sc.nextInt();
                    library.removeBook(removeId);
                    break;

                case 4:
                    library.displayBooks();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}