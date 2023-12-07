package lab13;
import java.io.*;
public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Создаем объекты BufferedReader для чтения с клавиатуры и FileWriter для записи в файл
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите текст: ");
            String inputText = reader.readLine(); // Считываем текст с клавиатуры
            System.out.print("Укажите путь к файлу для записи: ");
            String filePath = reader.readLine(); // Считываем путь к файлу с клавиатуры
            FileWriter writer = new FileWriter(filePath);
            // Записываем введенный текст в файл
            writer.write(inputText);
            writer.close(); // Закрываем файл
            System.out.println("Текст успешно записан в файл.");
        }
        catch (IOException e) {
            System.err.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}