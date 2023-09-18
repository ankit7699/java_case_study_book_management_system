public class Book {
    private int bookId;
    private String bookName;
    private String ISBN;

    public Book(int bookId, String bookName, String ISBN) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", ISBN: " + ISBN;
    }
}
