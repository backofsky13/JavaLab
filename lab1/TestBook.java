package lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("War and Peace", 1300);
        Book b2 = new Book("The Great Gatsby", 320);
        Book b3 = new Book("Ann of Green Gables", 384);
        System.out.println(b1);
        b1.theHalfPages();
        b2.theHalfPages();
        b3.theHalfPages();
    }
}