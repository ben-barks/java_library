import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> books;
    private String name;

    public Borrower(String name) {
        this.books = new ArrayList<>();
        this.name = name;
    }

    public int getBooks() {
        return this.books.size();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book book){
        this.books.add(book);
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.addBook(book);
    }
}

