class Book {
    int bookId;
    String title;
    String author;
    double price;
    static int totalBooks = 0;

    
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
        totalBooks++;
    }

    public void display() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : Rs. " + String.format("%.2f", price));
        System.out.println("-----------------------------------");
    }

    
    static void search(Book[] books,int searchId) {
        for(Book b:books){
            if(b.bookId==searchId){
                System.out.println("Book Found!");
                b.display();
                return;
            }
        }
        System.out.println("Book Not Found!");
    }

    static void search(Book[] books,String searchTitle) {
        for(Book b:books){
            if(b.title.equalsIgnoreCase(searchTitle)){
                System.out.println("Book Found!");
                b.display();
                return;
            }
        }
        System.out.println("Book Not Found!");
    }

    
    public Book getCostlierBook(Book otherBook) {
        if (this.price >= otherBook.price) {
            return this;
        } else {
            return otherBook;
        }
    }

}

public class LibraryManagement {
    public static void main(String[] args) {
        
        Book b1 = new Book(101, "The Guide", "R.K. Narayan", 299.00);
        Book b2 = new Book(102, "Wings of Fire", "A.P.J. Abdul Kalam", 350.50);
        Book b3 = new Book(103, "Malgudi Days", "R.K. Narayan", 250.00);

        System.out.println("Total Books Created: " + Book.totalBooks + "\n");
        System.out.println("--- All Book Details ---");
        b1.display();
        b2.display();
        b3.display();


        System.out.println("\n\n\n");
        Book[] books={b1,b2,b3};
        Book.search(books,101);
        
        Book.search(books,"the guide");

        System.out.println("\n--- Comparing Book 1 and Book 2 ---");
        Book costlier = b1.getCostlierBook(b2);
        System.out.println("The costlier book is:");
        costlier.display();
    }
}