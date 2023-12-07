package lab13;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class ReadFromFile {
    public static void main(String[] args) {
        try {
            String filePath = "C:\\Users\\koche\\OneDrive\\Desktop\\Test.txt";
            // Создаем объект FileReader для чтения файла
            FileReader fileReader = new FileReader(filePath);
            // Создаем объект BufferedReader для более эффективного чтения
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            // Закрываем файл и ресурсы
            reader.close();
        }
        catch (IOException e) {
            System.err.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}