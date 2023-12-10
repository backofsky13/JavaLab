package lab13;
import java.io.*;
public class ReplaceInfo {
    public static void main(String[] args) {
        try {
            String filePath = "/Users/nikolaj/Downloads/Archive/UniversityDownload/BackOfSky.txt";
            // Создаем объект FileReader для чтения файла
            FileReader fileReader = new FileReader(filePath);
            // Создаем объект BufferedReader для более эффективного чтения
            BufferedReader reader = new BufferedReader(fileReader);
            // Читаем содержимое файла и сохраняем его в строке
            StringBuilder fileContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line).append("\n");
            }
            // Закрываем файл и ресурсы
            reader.close();
            // Получаем новую информацию, введенную с клавиатуры
            System.out.print("Введите новую информацию: ");
            BufferedReader keyboardReader = new BufferedReader(new InputStreamReader(System.in));
            String newContent = keyboardReader.readLine();
            // Создаем объект FileWriter для записи в файл
            FileWriter fileWriter = new FileWriter(filePath);
            // Записываем новую информацию в файл
            fileWriter.write(newContent);
            // Закрываем файл и сохраняем изменения
            fileWriter.close();
            System.out.println("Информация успешно заменена в файле.");
        }
        catch (IOException e) {
            System.err.println("Произошла ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
