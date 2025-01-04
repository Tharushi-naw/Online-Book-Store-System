import java.util.ArrayList;

public class LibraryManager {
    //Collection to store books
    private ArrayList<Book> bookList = new ArrayList<>();

    //Method to add a book to the collection
    public void addBook(Book book){
        bookList.add(book);
        System.out.println("Book added successfully!");
    }

    //Method to list all books
    public void listBooks(){
        if (bookList.isEmpty()){
            System.out.println("No books available");
        } else {
            System.out.println("Listing all books");
            for (Book book : bookList){
                System.out.println(book);
            }
        }
    }

    //Method to search for a book by title
    public Book searchBook(String title) {
        for (Book book : bookList){
            if (book.getTitle().equalsIgnoreCase(title)){
                return book;
            }
        }
        return null;
    }

    //Method to remove a book by title
    public void removeBook(String title){
        Book book = searchBook(title);
        if (book != null) {
            bookList.remove(book);
            System.out.println("Book removed successfully");
        } else {
            System.out.println("Book not found");
        }
    }
}
