package lab10;
import java.util.Scanner;
public class OddNumbersInSequence {
    public static void main(String[] args) {
        printOddNumbers();
    }
    public static void printOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0) {
            // Базовый случай: встречен 0, завершаем рекурсию
            return;
        } else if (num % 2 != 0) {
            // Встречено нечетное число, выводим его
            System.out.println(num);
        }
        // Рекурсивный вызов функции для следующего числа
        printOddNumbers();
    }
}