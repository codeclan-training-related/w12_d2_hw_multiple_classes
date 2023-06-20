import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> bookCollection;
    private Library library;


    public Borrower (String name, Library libraryName){
        this.name = name;
       this.bookCollection = new ArrayList<>();
        this.library = libraryName;
    }

    public int colllectionCount(){
        return this.bookCollection.size();
    }

    public void borrowBook(Book book){
        if( library.bookCount()>0) {
            this.bookCollection.add(book);
            this.library.removeBook(book);
        }
    }



}
