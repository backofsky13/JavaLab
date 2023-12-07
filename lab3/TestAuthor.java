package lab3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Alexandr Sergeevich Pushkin", "SanyaPushkin@gmail.com", 'M');
        Author a2 = new Author("Esenin", "Esenin@gmail.com", 'F');
        Author a3 = new Author("Fedor Dostoevskiy", "Fed'kaDostoevskiy@gmail.com", 'M');
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}