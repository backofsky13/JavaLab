package lab11;
import java.util.Arrays;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator<Student> {
    // Основной метод программы
    public static void main(String[] args) {
        // Создание массива объектов класса Student, который может содержать до 5 элементов
        Student[] students = new Student[5];
        // Запуск цикла для инициализации массива students объектами Student с определенными параметрами
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student(i, "Name" + i, i * 10);
        }
        // Вывод массива студентов в виде строки
        System.out.println(Arrays.toString(students));
        // Создание нового объекта класса SortingStudentsByGPA и вызов метода quickSortReversed для сортировки студентов по убыванию GPA
        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSortReversed(students, 0, students.length - 1);
        // Вывод отсортированного массива студентов в виде строки
        System.out.println(Arrays.toString(students));
    }
    // Реализация метода compare интерфейса Comparator для сравнения студентов по их общему баллу (GPA)
    public int compare(Student o1, Student o2) {
        return o1.getTotalScore().compareTo(o2.getTotalScore());
    }
    // Метод для быстрой сортировки массива студентов по убыванию GPA
    public void quickSortReversed(Student[] students, int low, int high) {
        if (low < high) {
            // Находим позицию опорного элемента и разделяем массив
            int pivotIndex = partition(students, low, high);
            // Рекурсивно сортируем две части массива
            quickSortReversed(students, low, pivotIndex - 1);
            quickSortReversed(students, pivotIndex + 1, high);
        }
    }
    // Быстрая сортировка
    private int partition(Student[] students, int low, int high) {
        Student pivot = students[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (compare(students[j], pivot) > 0) {
                i++;
                // Меняем элементы местами
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }
        // Меняем опорный элемент и элемент, стоящий на позиции i+1
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;
        return i + 1;
    }
}