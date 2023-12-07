package lab18;
import java.io.Serializable;
public class Main {
    public static void main(String[] args){
        MyGenericClass<Integer, Cat, String> myObject = new MyGenericClass<>(10, new Cat(), "Hello");
        myObject.printClassNames();
        Integer[] intArray = {5, 2, 7, 8, 9};
        MinMax<Integer> minMax = new MinMax<>(intArray);
        System.out.println("Min: " + minMax.findMin());
        System.out.println("Max: " + minMax.findMax());
        int num1 = 20;
        double num2 = 2.5;
        System.out.println("Sum: " + Calculator.sum(num1, num2));
        System.out.println("Multiplication: " + Calculator.multiply(num1, num2));
        System.out.println("Division: " + Calculator.divide(num1, num2));
        System.out.println("Subtraction: " + Calculator.subtract(num1, num2));
        Integer[][] intMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix<Integer> matrix = new Matrix<>(intMatrix);
        matrix.printMatrix();
    }
}
interface Animal {
    void makeSound();
}
class Cat implements Serializable, Animal {
    public void makeSound() {
        System.out.println("Meow!");
    }
}
