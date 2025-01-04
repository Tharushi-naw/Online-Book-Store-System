public class Main {
    public static void main(String[] args) {
        //Initialize rge bookstore and order manager
        BookStore store = new BookStore();
        OrderManager manager = new OrderManager();

        //add books to the store
        store.addBook(new Book("Java", "Doe", 49.99, 14));
        store.addBook(new Book("Data Structures", "smith", 55.99, 4));

        //Test Cases
        System.out.println("----Test cases----");

        //Test 1: place an order successfully
        manager.placeOrder(store, "Java", 3);

        //Test 2: attempt to order a book not in stock
        manager.placeOrder(store, "Python", 1);

        //Test 3: attempt to order more than available quantity
        manager.placeOrder(store, "Data Structures", 6);
    }
}