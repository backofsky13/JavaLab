package lab7;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляр класса FootballFrame, который представляет графическое окно для отображения счета и информации о футбольном матче.
        FootballFrame footballFrame = new FootballFrame("Score Table");
        // Устанавливаем операцию закрытия окна по умолчанию: завершение работы программы при закрытии окна.
        footballFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Устанавливаем размер окна на 900x600 пикселей.
        footballFrame.setSize(900, 600);
        // Автоматически подстраиваем размер окна под содержимое.
        footballFrame.pack();
        // Делаем окно видимым.
        footballFrame.setVisible(true);
    }
}