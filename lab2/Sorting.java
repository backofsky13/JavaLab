package lab2;
import java.util.Arrays;
import java.util.Random;
public class Sorting {
    public static void main(String[] args) {
        int size = 10;
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }
}