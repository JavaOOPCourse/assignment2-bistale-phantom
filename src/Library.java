public class Library {

    final private Book[] books;
    private int count;

    public Library(int capacity) {
        books = new Book[capacity];
        count = 0;
    }

    // TODO: Add book to array
    public void addBook(Book book) {
        if (count <= books.length) {
            books[count] = book;
            count++;
        }
        System.out.println("library doesn't have enough place");
    }

    // TODO: Display all books
    public void displayBooks() {
        for (Book b: books) {
            System.out.println(b);
        }
    }

    // TODO: Search book by title
    public Book searchByTitle(String title) {
        for (Book b: books) {
            if (b.getTitle() == title) {
                return b;
            }
        };
        return null;
    }

    // TODO: Borrow book by title
    public void borrowBook(String title) {
        Book found = searchByTitle(title);
        if (found != null) {
            found.borrowBook();
        }
        else System.out.println("don't have this book");
    }

    // TODO: Return book by title
    public void returnBook(String title) {
        Book found = searchByTitle(title);
        if (found != null) {
            found.returnBook();
        }
        else System.out.println("we don't have this book");
    }
}
