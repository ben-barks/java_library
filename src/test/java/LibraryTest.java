import org.junit.Before;
import org.junit.Test;

import static com.sun.webkit.PageCache.getCapacity;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;
    Borrower borrower;
    Book book2;

    @Before
    public void before(){
        library = new Library(10);
        book = new Book("Invisible Monsters", "Chuck Palahniuk", "transgressive fiction");
        borrower = new Borrower("Mr Pope");
        book2 = new Book("The Big Sleep", "Raymond Chandler", "crime");
    }

    @Test
    public void hasCapacity(){
        assertEquals(10, library.getCapacity());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary(){
        library.add(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cannotAddBookToLibrary(){
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        library.add(book);
        assertEquals(10, library.countBooks());
    }

    @Test
    public void canLendBook(){
        library.add(book);
        library.add(book);
        library.removeBook();
        assertEquals(1, library.countBooks());
    }

//    @Test
//    public void canTellHowManyBooksThereAreByGenre(){
//        library.add(book);
//        library.add(book);
//        library.add(book);
//        library.add(book2);
//        library.add(book2);
//        assertEquals(("transgressive fiction": 3), library.howManyBooksByGenre("transgressive fiction"));
//    }
}
