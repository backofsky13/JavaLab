package lab11;
import java.util.Arrays;
public class Test {
    public static void main(String[] args) {
        // Создание массива объектов класса Student, который может содержать до 10 элементов
        Student[] students = new Student[10];
        // Создание массива long для хранения идентификаторов студентов
        long[] iDNumber = new long[10];
        // Запуск цикла для инициализации массивов students и ids
        for (int i = 0; i < students.length; i++) {
            // Создание объекта Student с определенными параметрами
            students[i] = new Student(-i, "Name" + i, i * 10);
            // Запись идентификатора студента в массив ids
            iDNumber[i] = students[i].getId();
        }
        // Вывод идентификаторов студентов в виде строки
        System.out.println(Arrays.toString(iDNumber));
        // Создание нового объекта класса Test и вызов метода bubbleSort с массивом ids
        new Test().insertionSort(iDNumber);
        // Вывод отсортированных идентификаторов студентов
        System.out.println(Arrays.toString(iDNumber));
    }
    // Метод для сортировки массива методом вставки
    public void insertionSort(long[] iDNumber) {
        int n = iDNumber.length;
        for (int i = 1; i < n; i++) {
            long current = iDNumber[i];
            int j = i - 1;
            while (j >= 0 && iDNumber[j] > current) {
                iDNumber[j + 1] = iDNumber[j];
                j--;
            }
            iDNumber[j + 1] = current;
        }
    }
}