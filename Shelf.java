// coding task 3

public class Shelf {
    public int capacity;
    public int totalBooks;
    public void showDetails() {
        System.out.println("Shelf capacity: " + capacity);
        System.out.println("Number of books: " + totalBooks);
    }
    public void addBooks(int books) {
        if(capacity == 0) {
            System.out.println("Zero capacity. Cannot add books.");
        }
        else {
            totalBooks += books;
            if(totalBooks > capacity) {
                System.out.println("Exceeds capacity.");
                totalBooks -= books;
            }
            else {
                System.out.println(books + " books added to shelf");
            }
        }
    }
}
