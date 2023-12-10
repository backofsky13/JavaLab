package lab1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Good to Great", 1113);
        Book b2 = new Book("Prestuplenie and nakazanie", 977);
        Book b3 = new Book("World", 543);
        System.out.println(b1);
        b1.theHalfPages();
        b2.theHalfPages();
        b3.theHalfPages();
    }
}
