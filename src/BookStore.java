import java.util.ArrayList;s
import java.util.List;

public class BookStore {
    //List to store books
    private List<Book> books;

    //Constructor to initialize the book list
    public BookStore(){
        this.books = new ArrayList<>();
    }

    //method to add a new book to the store
    public void addBook(Book book){
        books.add(book);
    }

}
