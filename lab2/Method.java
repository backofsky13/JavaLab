package lab2;
public class Method {
    public static void main(String[] args) {
        int n = -3;
        long factorial = calculateFactorial(n);
        System.out.println("Факториал числа " + n + " = " + factorial);
    }
    public static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Невозможно вычислить факториал.");
            System.exit(0);
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}