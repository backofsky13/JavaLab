package lab2;
public class Sum {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("Аргумент " + (i+1) + ": " + a[i]);
            sum = sum + a[i];
        }
        System.out.println("Сумма элементов массива a: " + sum);
    }
}