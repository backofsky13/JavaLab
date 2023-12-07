package lab10;
import java.util.Scanner;
public class CountOnesInSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalOnes = countOnes(scanner);
        System.out.println("Количество единиц: " + totalOnes);
    }
    public static int countOnes(Scanner scanner) {
        int num = scanner.nextInt();
        if (num == 0) {
            // Встречены два нуля подряд, завершаем рекурсию
            return 0;
        }
        else if (num == 1) {
            // Встречена единица, продолжаем рекурсию
            return 1 + countOnes(scanner);
        }
        else {
            // Встречено другое число, продолжаем рекурсию без увеличения счетчика
            return countOnes(scanner);
        }
    }
}