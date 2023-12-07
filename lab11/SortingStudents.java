package lab11;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudents implements Comparator<Student> {
    public static void main(String[] args) {
        // Создание массива объектов класса Student (students1), который может содержать до 5 элементов
        Student[] students1 = new Student[5];
        // Запуск цикла для инициализации массива students1 объектами Student с определенными параметрами
        for (int i = 0; i < students1.length; i++) {
            students1[i] = new Student(i, "Name" + i, i * 10);
        }
        // Создание массива объектов класса Student (students2), который может содержать до 7 элементов
        Student[] students2 = new Student[7];
        // Запуск цикла для инициализации массива students2 объектами Student с определенными параметрами
        for (int i = 0; i < students2.length; i++) {
            students2[i] = new Student(-i, "Name" + i, i * 10);
        }
        // Создание массива объектов класса Student (result) для объединения students1 и students2
        Student[] result = new Student[students1.length + students2.length];
        // Копирование элементов из students1 в result
        System.arraycopy(students1, 0, result, 0, students1.length);
        // Копирование элементов из students2 в result, начиная с позиции students1.length
        System.arraycopy(students2, 0, result, students1.length, students2.length);
        // Создание нового объекта класса SortingStudents и вызов метода sort для сортировки студентов
        new SortingStudents().sort(result);
        // Вывод отсортированного массива студентов в виде строки
        System.out.println(Arrays.toString(result));
    }
    // Метод для сортировки слиянием
    public void sort(Student[] students) {
        for (int i = 0; i < students.length - 1; i++) {
            // Проверка, если текущий студент имеет больший GPA, чем следующий студент
            if (compare(students[i], students[i + 1]) > 0) {
                // Обмен местами студентов с использованием временной переменной temp
                Student temp = students[i];
                students[i] = students[i + 1];
                students[i + 1] = temp;
            }
        }
    }
    // Реализация метода compare интерфейса Comparator для сравнения студентов по их общему баллу (GPA)
    public int compare(Student o1, Student o2) {
        return o1.getTotalScore().compareTo(o2.getTotalScore());
    }
}