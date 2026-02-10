import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(10);

        int choice;

        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Add book");
            System.out.println("2. Add e-book");
            System.out.println("3. Display all books");
            System.out.println("4. Search book by title");
            System.out.println("5. Borrow book");
            System.out.println("6. Return book");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    // TODO: Read input and add Book
                    System.out.println("Title: "); String t = scanner.nextLine();
                    System.out.println("Author: "); String a = scanner.nextLine();
                    System.out.println("Year: "); int y = scanner.nextInt();
                    Book b = new Book(t, a, y);
                    library.addBook(b);
                    break;

                case 2:
                    // TODO: Read input and add EBook
                    System.out.println("Title: "); String t2 = scanner.nextLine();
                    System.out.println("Author: "); String a2 = scanner.nextLine();
                    System.out.println("Year: "); int y2 = scanner.nextInt();
                    System.out.println("FileSize: "); double f = scanner.nextDouble();
                    EBook e = new EBook(t2, a2, y2, f);
                    library.addBook(e);
                    break;

                case 3:
                    library.displayBooks();
                    break;

                case 4:
                    // TODO: Search book
                    System.out.println("Which book you want to find? "); String tit = scanner.nextLine();
                    library.searchByTitle(tit);
                    break;

                case 5:
                    // TODO: Borrow book
                    System.out.println("Which book you want to borrow? "); String b1 = scanner.nextLine();
                    library.borrowBook(b1);
                    break;

                case 6:
                    // TODO: Return book
                    System.out.println("Which book you want to find? "); String b2 = scanner.nextLine();
                    library.returnBook(b2);
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option!");
            }

        } while (choice != 7);

        scanner.close();
    }
}
