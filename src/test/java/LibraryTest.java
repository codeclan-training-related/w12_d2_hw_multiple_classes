import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
//    private instances:
    private Library newLibrary;
    private Book book1;
    private Book book2;
    private Book book3;


    @Before
    public void before() {
//  will be executed before each test method
        book1 = new Book("Sky","Blue","Fiction");
        book2 = new Book(" Grass", "Green", "Novel");
        book3 = new Book( "Ocean", "Pink", "novel");
        newLibrary = new Library();
    };

    @Test
    public void canAddBook(){
        newLibrary.addBook(book2);
        newLibrary.addBook(book1);
        newLibrary.addBook(book2);
        newLibrary.addBook(book1);
        newLibrary.addBook(book2);
        assertEquals(5, newLibrary.bookCount());
//        test wont pass if you try to add 6 books because the capacity is 5
    }

    @Test
    public void canRemoveBook(){
        newLibrary.addBook(book1);
        newLibrary.addBook(book2);
        newLibrary.removeBook(book1);
        assertEquals(1, newLibrary.bookCount());

    }


}










//
//
//import org.junit.Before;
//import org.junit.Test;
//import java.util.ArrayList;
//import static org.junit.Assert.assertEquals;
//public class LibraryTest {
//    private Library library;
//    private Book book1;
//    private Book book2;
//    private Book book3;
//
//    @Before
//    public void before() {
//        book1 = new Book("Harry Potter", "JK Rowland", "Si-fi");
//        book2 = new Book("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance");
//        book3 = new Book("Frankenstein", "Mary Shelley", "Si-fi");
//        ArrayList<Book> booksToPutInLibrary = new ArrayList<>();
//        booksToPutInLibrary.add(book1);
//        booksToPutInLibrary.add(book2);
//        booksToPutInLibrary.add(book3);
//        library = new Library(booksToPutInLibrary);
//    }
//
//    @Test
//    public void libraryHasStock() {
//        assertEquals(3, library.getStock());
//    }
//
//
//}
//
