package lab12;
import java.util.ArrayDeque;
import java.util.Queue;

public class Game2 {
    private final Queue<Integer> firstPlayer;  // Создаем очередь Queue для первого игрока first-in-first-out
    private final Queue<Integer> secondPlayer; // Создаем очередь Queue для второго игрока
    public Game2(String firstPlayer, String secondPlayer) {
        this.firstPlayer = new ArrayDeque<>();  // Инициализируем очередь для первого игрока
        this.secondPlayer = new ArrayDeque<>(); // Инициализируем очередь для второго игрока
        // Заполняем очереди картами из строковых значений, парся каждую цифру
        for (int i = 0; i < 5; i++) {
            this.firstPlayer.add(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.add(Integer.parseInt(secondPlayer.substring(i, i + 1)));
        }
    }
    public String play() {
        int count = 0;
        // Игра продолжается, пока обе очереди не пусты и счетчик не превышает 106
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count < 106) {
            if (firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0) {
                // Перекладываем карты в очередь первого игрока
                firstPlayer.add(firstPlayer.remove());
                firstPlayer.add(secondPlayer.remove());

            } else {
                // Перекладываем карты в очередь второго игрока
                secondPlayer.add(firstPlayer.remove());
                secondPlayer.add(secondPlayer.remove());
            }
            count++;
        }
        String res = "";
        if (firstPlayer.isEmpty())
            res += "second "; // Если у первого игрока закончились карты, второй игрок победил
        else if (secondPlayer.isEmpty())
            res += "first ";  // Если у второго игрока закончились карты, первый игрок победил
        res += count;
        if (count >= 106)
            res += " botva"; // Если счетчик превысил 106, объявляем "Ботву"
        return res;
    }
    public static void main(String[] args) {
        // Тестовые запуски игры и вывод результата
        System.out.println(new Game2("99999", "24680").play());
        System.out.println(new Game2("12345", "67890").play());
        System.out.println(new Game2("13029", "42685").play());
    }
}