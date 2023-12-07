package lab17;
import java.util.ArrayList;
public class Starter {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<>();
        s.add(new Student("Стенков Михаил Антонович", 93, 8, 19));
        s.add(new Student("Фамилия Имя Отчество", 78, 14, 18));
        s.add(new Student("Устал придумывать ФИО", 67, 20, 20));
        s.add(new Student("Надоело уже блин", 93, 8, 19));
        new LabClassUI(s);
    }
}