public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Create sample books
        Book book1 = new Book("Java Programming", "John Doe", 45.99, 10);
        Book book2 = new Book("Data Structures", "Jane Smith", 39.99, 5);

        try {
            // Add books to the manager
            manager.addBook(book1);
            manager.addBook(book2);


            // Search for a book
            Book foundBook = manager.searchBook("Advanced Java");
            System.out.println("Book found" + foundBook);
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

            // List all books
            manager.listBooks();
    }
}
