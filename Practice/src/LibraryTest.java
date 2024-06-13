import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testSearch() {
        Book[] books = {
            new Book(1, "Book One", "Author One", 2001),
            new Book(2, "Book Two", "Author Two", 2002),
            new Book(3, "Book Three", "Author Three", 2003)
        };
        Library library = new Library(books);
        assertEquals(books[1], library.search(2));
        assertNull(library.search(4));
    }

    @Test
    public void testSearchBs() {
        Book[] books = {
            new Book(1, "Book One", "Author One", 2001),
            new Book(2, "Book Two", "Author Two", 2002),
            new Book(3, "Book Three", "Author Three", 2003)
        };
        Library library = new Library(books);
        assertEquals(books[1], library.search_bs(2));
        assertNull(library.search_bs(4));
    }
}
