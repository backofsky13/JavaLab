package lab8;
import javax.swing.*;
import java.awt.*;
import javax.imageio.ImageIO;
import java.io.File;
public class DisplayImage {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(1);
        }
        String imagePath = args[0];
        // Создаем фрейм
        JFrame frame = new JFrame("Отображение изображения");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Загружаем изображение
        ImageIcon imageIcon = loadImage(imagePath);
        if (imageIcon != null) {
            // Создаем метку для отображения изображения
            JLabel label = new JLabel(imageIcon);
            // Добавляем метку на панель фрейма
            frame.getContentPane().add(label);
            // Устанавливаем размер фрейма
            frame.pack();
            // Отображаем фрейм
            frame.setVisible(true);
        }
        else {
            System.out.println("Не удалось загрузить изображение.");
        }
    }
    private static ImageIcon loadImage(String imagePath) {
        try {
            File file = new File(imagePath);
            Image image = ImageIO.read(file);
            return new ImageIcon(image);
        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}