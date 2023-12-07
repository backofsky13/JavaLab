package lab8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public class RandomShapes {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Random Shapes");
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                Random rand = new Random();
                for (int i = 0; i < 20; i++) {
                    int shapeType = rand.nextInt(3); // Случайно выбираем тип фигуры (круг, прямоугольник или треугольник)
                    int shapeX = rand.nextInt(700); // Случайная позиция X
                    int shapeY = rand.nextInt(500); // Случайная позиция Y
                    Color shapeColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // Случайный цвет
                    if (shapeType == 0) {
                        int radius = rand.nextInt(50) + 20; // Случайный радиус для круга
                        Circle circle = new Circle(shapeColor, shapeX, shapeY, radius);
                        circle.draw(g);
                    } else if (shapeType == 1) {
                        int width = rand.nextInt(100) + 50; // Случайная ширина для прямоугольника
                        int height = rand.nextInt(100) + 50; // Случайная высота для прямоугольника
                        Rectangle rectangle = new Rectangle(shapeColor, shapeX, shapeY, width, height);
                        rectangle.draw(g);
                    } else {
                        int sideLength = rand.nextInt(100) + 50; // Случайная длина стороны для треугольника
                        Triangle triangle = new Triangle(shapeColor, shapeX, shapeY, sideLength);
                        triangle.draw(g);
                    }
                }
            }
        };
        frame.add(panel);
        frame.setVisible(true);
    }
}