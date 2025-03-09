public class Reader {
    public String name="New user";
    public int cap;
    public String [] books;
    public int cnt;
    public String createReader(String name, int cap){
        this.name = name;
        this.cap = cap;
        this.books = new String[cap];
        return "A new reader is created!";
    }
    public void readerInfo() {
        System.out.println("Name: "+name);
        System.out.println("Capacity: "+cap);
        System.out.println("Books: ");
        if(cnt==0){
            System.out.println("No books added yet");
        }
        else{
            for(int i=0;i<cap;i++){
                System.out.println("Book " + (i+1) + ": " + books[i]);
            }
        }
    }
    public void addBook(String book) {
        cnt++;
        if(cnt>cap){
            System.out.println("No more capacity");
        }
        else {
            books[cnt-1] = book;
        }
    }
}
