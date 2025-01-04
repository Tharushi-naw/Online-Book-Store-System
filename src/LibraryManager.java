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
}
