public class Main {
    public static void main(String[] args) {
        //Initialize bookstore and order manager
        BookStore store = new BookStore();

        //add books to the store
        store.addBook(new Book("Java", "Doe", 49.99, 14));
        store.addBook(new Book("Data Structures", "smith", 55.99, 4));

        //Save books to a file
        String filename = "books.txt";
        store.saveBooksToFile(filename);

        //Clear the store and load books from the file
        store.loadBooksFromFiles(filename);

        //Display loaded books
        System.out.println("Books in store after loading:");
        for (Book book : store.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " - $" + book.getPrice() + " (" + book.getQuantity() + " in stock)");
        }
    }
}