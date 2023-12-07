package lab1;
public class Book {
    private String book;
    private int pages;
    public Book(String n, int p){
        book = n;
        pages = p;
    }
    public Book(String n){
        book = n;
        pages = 0;
    }
    public Book(){
        book = "1984";
        pages = 0;
    }
    public void setBook(){
        this.book = book;
    }
    public void setPages(){
        this.book = book;
    }
    public String getName(){
        return book;
    }
    public int getPages(){
        return pages;
    }
    public void theHalfPages(){
        System.out.println("The half pages of " + book + " is " + (pages/2) + " pages");
    }
}