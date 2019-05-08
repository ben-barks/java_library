import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book book;
    Library library;

    @Before
    public void before() {
        borrower = new Borrower("Mr Pope");
        book = new Book("Invisible Monsters", "Chuck Palahniuk", "transgressive fiction");
        library = new Library(10);
    }

    @Test
    public void hasName(){
        assertEquals("Mr Pope", borrower.getName());
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, borrower.getBooks());
    }

    @Test
    public void canBorrowBookfromLibrary(){
        library.add(book);
        borrower.borrowBookFromLibrary(library);
        assertEquals(1, borrower.getBooks());
        assertEquals(0, library.countBooks());
    }



}
