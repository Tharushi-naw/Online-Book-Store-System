import java.util.ArrayList;
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

    //method to search for a book by title
    public Book searchBook(String title) throws BookNotFoundException{
        for (Book book : books){
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        //Throw custom exception if the book is not found
        throw new BookNotFoundException ("Book with title'" + title + "'not found");
    }
}
