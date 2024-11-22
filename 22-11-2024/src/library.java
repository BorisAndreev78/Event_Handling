public class library {
    public static void main(String[] args) {
        Book it = new Book("It", "Steven King", 467);
        Book odyssey = new Book("Odyssey", "Homer", 345);
        Book theLongWayDown = new Book("The long way down", "Jack Gallagher", 195);
        it.displayDetails();
        odyssey.displayDetails();
        theLongWayDown.displayDetails();
    }
}


// Define the Book class
class Book {
    private String title;
    private String author;
    private int numberOfpages;


    // Constructor
    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfpages = numberOfPages;
    }


    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Size: " + numberOfpages + " pages");


    }
}
