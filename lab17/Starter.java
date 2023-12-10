package lab17;
import java.util.ArrayList;
public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Новиков Петр Сергеевич", 75, 5, 23));
        s.add(new Student("Романов Тимур Генадьевич", 83, 7, 18));
        s.add(new Student("Тульский Пряник Двусотович", 57, 3, 20));
        s.add(new Student("Пиковый Туз Козырневыч", 79, 13, 21));
        new LabClassUI(s);
    }
}
