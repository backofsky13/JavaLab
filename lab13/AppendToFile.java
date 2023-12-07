package lab13;
import java.io.*;
public class AppendToFile {
    public static void main(String[] args) {
        try {
            // Укажите путь к файлу, который вы хотите изменить
            String filePath = "C:\\Users\\koche\\OneDrive\\Desktop\\Test.txt";
            // Получаем новый текст, введенный с клавиатуры
            System.out.print("Введите текст для добавления в файл: ");
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
            String newText = keyboardReader.readLine();
            // Создаем объект FileWriter с флагом true для добавления в конец файла
            FileWriter fileWriter = new FileWriter(filePath, true);
            // Записываем новый текст в конец файла
            fileWriter.write(newText);
            fileWriter.close();
            System.out.println("Текст успешно добавлен в файл.");
        }
        catch (IOException e) {
            System.err.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }
}