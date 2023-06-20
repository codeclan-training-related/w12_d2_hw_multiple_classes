
import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> books;


//    constructor:
    public Library (){
        this.books = new ArrayList<>();
        this.capacity = 5;
    }

//    methods:

    public int bookCount(){
        return books.size();
    }
    public void addBook(Book book){
        int bookCount=bookCount();
        if (bookCount<this.capacity){
        books.add(book);}
    }

    public void removeBook(Book book){
        int indexOfBook=books.indexOf(book);
        books.remove(indexOfBook);
    }













}




//
//
//import java.util.ArrayList;
//public class Library {
//    private int capacity;
//    private ArrayList<Book> stock;
//
//
//    public Library(ArrayList<Book> booksToPutInLibrary){
//        this.capacity = 3;
//        this.stock = booksToPutInLibrary;
//    }
//    public int getStock(){
//        return stock.size();
//    }
//
//    public int getCapacity(){
//        return capacity;
//    }
//    public Book removeBook(){
//        return this.stock.remove(0);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
