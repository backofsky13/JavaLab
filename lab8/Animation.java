package lab8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class Animation {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Animation");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new AnimationPanel();
        frame.add(panel);
        frame.setVisible(true);
    }
}
class AnimationPanel extends JPanel implements ActionListener {
    private Timer timer;
    private int currentFrame = 0;
    private int totalFrames = 3; // Общее количество кадров в анимации
    private ImageIcon[] frames;
    public AnimationPanel() {
        // Загрузите кадры анимации и сохраните их в массиве ImageIcon
        frames = new ImageIcon[totalFrames];
        for (int i = 0; i < totalFrames; i++) {
            frames[i] = new ImageIcon("/Users/nikolaj/Downloads/Archive/Frame" + i + ".jpg"); // Замените на путь к вашим изображениям
        }
        // Настройка таймера для анимации
        int delay = 1000; // Задержка между кадрами (в миллисекундах)
        timer = new Timer(delay, this);
        timer.start();
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (currentFrame < totalFrames) {
            // Отрисовка текущего кадра
            frames[currentFrame].paintIcon(this, g, 0, 0);
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // Обновление текущего кадра и перерисовка панели
        currentFrame++;
        if (currentFrame >= totalFrames) {
            currentFrame = 0; // Возвращаемся к первому кадру
        }
        repaint();
    }
}