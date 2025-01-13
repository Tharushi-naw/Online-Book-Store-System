public class Main {
    public static void main(String[] args) {
        LibraryManager manager = new LibraryManager();

        // Create some sample books
        Book book1 = new Book("Java Programming", "John Doe", 45.99, 10);
        Book book2 = new Book("Data Structures", "Jane Smith", 39.99, 5);

        try {
            // Add books to the manager
            manager.addBook(book1);
            manager.addBook(book2);

            // Attempt to add a duplicate book
            manager.addBook(book1); //throw an exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // List all books
        manager.listBooks();

        // Search for a book
        Book foundBook = manager.searchBook("Java Programming");
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found.");
        }

        // Remove a book
        manager.removeBook("Java Programming");
        manager.listBooks();
    }
}
