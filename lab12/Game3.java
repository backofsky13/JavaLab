package lab12;
import java.util.ArrayDeque;
import java.util.Deque;

public class Game3 {
    Deque<Integer> firstPlayer;  // Объявление очереди для первого игрока last-in-first-out
    Deque<Integer> secondPlayer; // Объявление очереди для второго игрока
    public Game3(String firstPlayer, String secondPlayer) {
        this.firstPlayer = new ArrayDeque<>();  // Инициализация очереди для первого игрока
        this.secondPlayer = new ArrayDeque<>(); // Инициализация очереди для второго игрока
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
            }
            else {
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
        System.out.println(new Game3("13579", "24680").play());
        System.out.println(new Game3("12345", "67890").play());
        System.out.println(new Game3("13029", "42685").play());
    }
}