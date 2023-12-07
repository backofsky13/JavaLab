package lab7;
import javax.swing.*;
import java.awt.*;
public class FootballFrame extends JFrame {
    // Создаем метку (Label) для отображения счета, последнего забившего и победителя
    private final JLabel scoreLabel = new JLabel("Result: 0 X 0", SwingConstants.CENTER);
    private final JLabel lastScorerLabel = new JLabel("Last Scorer: N/A", SwingConstants.CENTER);
    private final JLabel winnerLabel = new JLabel("Winner: DRAW", SwingConstants.CENTER);
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";
    // Конструктор класса FootballFrame
    public FootballFrame(String title) throws HeadlessException {
        super(title); // Вызываем конструктор суперкласса JFrame, передавая заголовок окна.
        // Создаем кнопки для Милана и Мадрида и назначаем обработчики событий
        JButton milanButton = new JButton("AC Milan");
        milanButton.addActionListener(e -> {
            milanScore++; // Увеличиваем счет Милана
            lastScorer = "AC Milan"; // Обновляем последнего забившего
            updateScores(); // Обновляем отображение счета и информации о последнем забившем.
        });
        JButton madridButton = new JButton("Real Madrid");
        madridButton.addActionListener(e -> {
            madridScore++; // Увеличиваем счет Мадрида
            lastScorer = "Real Madrid"; // Обновляем последнего забившего
            updateScores(); // Обновляем отображение счета и информации о последнем забившем.
        });
        // Настройка выравнивания и шрифта для компонентов
        milanButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        madridButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        lastScorerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        scoreLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        winnerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        Font serif = new Font("serif", Font.BOLD, 24);
        milanButton.setFont(serif);
        madridButton.setFont(serif);
        lastScorerLabel.setFont(serif);
        scoreLabel.setFont(serif);
        winnerLabel.setFont(serif);
        // Устанавливаем сетку 2x3 и добавляем компоненты в окно
        setLayout(new GridLayout(2, 3));
        add(lastScorerLabel);
        add(scoreLabel);
        add(winnerLabel);
        add(milanButton);
        add(new JPanel()); // Пустая панель для создания отступа
        add(madridButton);
    }
    // Метод для обновления отображения счета и информации о последнем забившем
    private void updateScores() {
        scoreLabel.setText(String.format("Result: %d X %d", milanScore, madridScore));
        lastScorerLabel.setText(String.format("Last Scorer: %s", lastScorer));
        // Определяем победителя и обновляем информацию о победителе
        if (milanScore == madridScore) {
            winnerLabel.setText("Winner: DRAW");
        } else if (milanScore > madridScore) {
            winnerLabel.setText("Winner: AC Milan");
        } else {
            winnerLabel.setText("Winner: Real Madrid");
        }
    }
}