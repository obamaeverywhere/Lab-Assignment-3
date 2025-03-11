// coding task 5

public class Library {
    public int capacity;
    public int totalBooks;
    public String [] name;
    public void setBookCapacity(int capacity) {
        this.capacity = capacity;
        this.name = new String[capacity];
    }
    public void addBook(String name) {
        totalBooks++;
        if(totalBooks>capacity) {
            System.out.println("Exceeds maximum capacity. You can't add more than " + capacity + " books");
            totalBooks--;
        }
        else {
            this.name[totalBooks-1] = name;
            System.out.println("Book '" + name + "' added to the library");
        }
    }
    public void printDetail() {
        System.out.println("Maximum Capacity: " + capacity);
        System.out.println("Total Books: " + totalBooks);
        System.out.println("Book List: ");
        for(int i=0; i<capacity; i++) {
            if(name[i]!=null) System.out.println(name[i]);
        }

    }
}
