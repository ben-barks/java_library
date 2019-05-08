import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }

    public int countBooks() {
        return books.size();
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(Book book) {
        if (this.books.size() < 10) {
            books.add(book);
        }
        else {
            System.out.println("Capacity cap reached.");
        }
    }

    public Book removeBook() {
        return this.books.remove(0);
    }

//    public ArrayList<String>() genreList(){
//
//    }


//    public Object howManyBooksByGenre(String genre) {
//        HashMap<String, Integer> byGenre = new HashMap<String, Integer>();
//        byGenre.put((genre), (book.countByGenre()));
//        return byGenre;
//    }
}
