package lab20;
import java.util.Stack;
import java.util.NoSuchElementException;
public class RPNCalcTest {
    public static void main(String[] args) {
        RPNCalc calculator = new RPNCalc();
        // Тест на операцию сложения
        pushOperand(calculator, 5);
        pushOperand(calculator, 2);
        pushOperator(calculator, "+");
        int result = popOperand(calculator); // Получаем результат из стека
        System.out.println("Result: " + result);
        // Тест на операцию деления с ошибкой
        pushOperand(calculator, 10);
        pushOperand(calculator, 5);
        pushOperator(calculator, "/");
        pushOperator(calculator, "*");// Ошибка: только один операнд
        System.out.println("Test for division with error: 10 / ");
        try {
            result = popOperand(calculator);
            System.out.println("Result: " + result);
        } catch (NoSuchElementException e) {
            System.out.println("Error: Not enough operands for division.");
        }
    }
    private static void pushOperand(RPNCalc calculator, int operand) {
        calculator.getStack().push(operand);
    }
    private static void pushOperator(RPNCalc calculator, String operator) {
        int b = popOperand(calculator); // Второй операнд
        int a = popOperand(calculator); // Первый операнд
        int result = 0;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    result = a / b;
                }
                break;
            // Другие операции
        }
        System.out.println("Operation: " + a + " " + b + " " + operator);
        System.out.println("Result: " + result);

        calculator.getStack().push(result);
    }
    private static int popOperand(RPNCalc calculator) {
        return calculator.getStack().pop();
    }
}