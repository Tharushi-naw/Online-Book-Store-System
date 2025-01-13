public class Main {
    public static void main(String[] args) {
        // Create an instance of LibraryManager
        LibraryManager manager = new LibraryManager();

        // Create sample books
        Book book1 = new Book("Java Programming", "John Doe", 45.99, 10);
        Book book2 = new Book("Data Structures", "Jane Smith", 39.99, 5);

        // Step 1: List all books (should be empty initially)
        System.out.println("Step 1: Listing all books:");
        manager.listBooks();

        try {
            // Step 2: Add books to the manager
            System.out.println("\nStep 2: Adding books...");
            manager.addBook(book1);
            manager.addBook(book2);
            System.out.println("Books added successfully!");
        } catch (Exception e) {
            System.out.println("Error while adding books: " + e.getMessage());
        }

        // Step 3: Search for a book (should throw BookNotFoundException for 'Advanced Java')
        System.out.println("\nStep 3: Searching for 'Advanced Java':");
        try {
            Book foundBook = manager.searchBook("Advanced Java");
            System.out.println("Book found: " + foundBook);
        } catch (BookNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Step 4: List all books again to confirm added books
        System.out.println("\nStep 4: Listing all books after adding:");
        manager.listBooks();
    }
}
