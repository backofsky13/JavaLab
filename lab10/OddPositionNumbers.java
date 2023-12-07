package lab10;
import java.util.Scanner;
public class OddPositionNumbers {
    public static void main(String[] args) {
        printOddPositionNumbers();
    }
    public static void printOddPositionNumbers() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int position = 1; // Переменная для отслеживания позиции текущего числа
        while (num != 0) {
            if (position % 2 != 0) {
                // Выводим число, если его позиция нечетная
                System.out.println(num);
            }
            // Считываем следующее число и увеличиваем позицию
            num = scanner.nextInt();
            position++;
        }
    }
}