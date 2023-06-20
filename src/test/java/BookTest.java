import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book newBook;

    @Before
    public void before(){
         newBook = new Book( "Sugar Is Good", "King Red", "Fiction");
    }


    @Test
    public void bookHasName(){
        assertEquals("Sugar Is Good", newBook.getBookTitle());
    }



}
