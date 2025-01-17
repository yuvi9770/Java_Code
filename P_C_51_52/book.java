package P_C_51_52;

public class book {
    static int totalNOofBooks;
    String title;
    String author;
    String isbn;
    boolean isborrowed;

    static {
        totalNOofBooks = 0;
    }

    {
        totalNOofBooks++;
    }

    book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    book(String isbn) {
        this(isbn, "Unknown", "Unknown");
    }

    static int getTotalnoOfbooks() {
        return totalNOofBooks;
    }

    void borrowbooks() {
        if (isborrowed) {
            System.out.println("Already taken");
        } else {
            this.isborrowed = true;
            System.out.println("Enjoy " + this.title);
        }
    }

    void returnbooks() {
        if (isborrowed) {
            this.isborrowed = false;
            System.out.println("Hope you enjoy");
        } else {
            System.out.println("Already present in library");
        }

    }

    public static void main(String[] args) {
        book newBook = new book("gh87", "Designing", "ABCD");
        book nbook = new book("Slfdf");
        System.out.println(book.getTotalnoOfbooks());
        newBook.borrowbooks();
        nbook.borrowbooks();

        newBook.borrowbooks();
        newBook.returnbooks();
        newBook.returnbooks();
    }
}