import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower1;
    private Book book1;
    private Book book2;
    private Library library1;

    @Before
    public void before(){
        library1= new Library();
        borrower1 =new Borrower("Judy", library1);
        book2 = new Book( "Sugar Is Good", "King Red", "Fiction");
        book1 = new Book( "Wear", "Mina Blue", "Fiction");

    }

    @Test
    public void canGetColllectionCount(){
        assertEquals(0, borrower1.colllectionCount());
    }

    @Test
    public void canBorrowBook(){
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book2);
        borrower1.borrowBook(book1);
        assertEquals(1, borrower1.colllectionCount());
        assertEquals(2, library1.bookCount());
    }


}
