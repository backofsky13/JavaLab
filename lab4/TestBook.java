package lab4;

public class TestBook {
    public static void main(String[] args) {
        Book myBook = new Book("Lev Nikolaevich Tolstoy", "World", 1812);
        System.out.println("Автор: " + myBook.getAuthor());
        System.out.println("Название: " + myBook.getTitle());
        System.out.println("Год написания: " + myBook.getYear());
    }
}