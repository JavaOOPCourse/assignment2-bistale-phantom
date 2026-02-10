public class Book {

    // TODO: make fields private
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;

    // TODO: Implement parameterized constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    // TODO: Implement copy constructor
    public Book(Book other) {
        this.title = other.getTitle();
        this.author = other.getAuthor();
        this.year = other.getYear();
        this.isAvailable = other.isAvailable();
    }

    // TODO: Implement getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // TODO: Implement borrow logic
    public void borrowBook() {
        if (this.isAvailable) {
            this.isAvailable = false;
        }
        System.out.println("book is not available");
    }

    // TODO: Implement return logic
    public void returnBook() {
        this.isAvailable = true;
    }

    public String toString() {
        return "Title: " + this.title + ", Author: " + this.author + ", Year: " + this.year + ", Available: " + this.isAvailable ;
    }

    public boolean Equals(Book b) {
        return this.title == b.getTitle() &&
                this.year == b.getYear() && this.author == b.getAuthor();
    }
}
