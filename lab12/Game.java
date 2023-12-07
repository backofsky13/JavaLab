package lab12; //12
import java.util.Stack;

public class Game {
    private final Stack<Integer> firstPlayer;  // Создаем стек для первого игрока last-in-first-out
    private final Stack<Integer> secondPlayer; // Создаем стек для второго игрока
    public Game(String firstPlayer, String secondPlayer) {
        this.firstPlayer = new Stack<>();  // Инициализируем стек для первого игрока
        this.secondPlayer = new Stack<>(); // Инициализируем стек для второго игрока
        // Заполняем стеки картами из строковых значений
        for (int i = 4; i >= 0; i--) {
            this.firstPlayer.push(Integer.parseInt(firstPlayer.substring(i, i + 1)));
            this.secondPlayer.push(Integer.parseInt(secondPlayer.substring(i, i + 1)));
        }
    }
    private void pushBack(Stack<Integer> s, Integer item) {
        Stack<Integer> ns = new Stack<>(); // Создаем временный стек
        // Перекладываем все элементы из основного стека во временный стек
        while (!s.isEmpty())
            ns.push(s.pop());
        s.push(item); // Помещаем новый элемент в основной стек
        // Возвращаем элементы из временного стека обратно в основной стек
        while (!ns.isEmpty())
            s.push(ns.pop());
    }
    public String play() {
        int count = 0;
        // Игра продолжается, пока оба стека не пусты и счетчик не превышает 106
        while (!firstPlayer.isEmpty() && !secondPlayer.isEmpty() && count <= 106) {
            if (firstPlayer.peek() > secondPlayer.peek() && secondPlayer.peek() != 0) {
                // Переносим карты в основной стек первого игрока
                pushBack(firstPlayer, firstPlayer.pop());
                pushBack(firstPlayer, secondPlayer.pop());
            }
            else {
                // Переносим карты в основной стек второго игрока
                pushBack(secondPlayer, firstPlayer.pop());
                pushBack(secondPlayer, secondPlayer.pop());
            }
            count++;
        }
        String res = "";
        if (firstPlayer.isEmpty())
            res += "second "; // Если у первого игрока закончились карты, второй игрок победил
        else
            res += "first ";  // Если у второго игрока закончились карты, первый игрок победил
        res += count;
        if (count >= 106)
            res += " Ботва!"; // Если счетчик превысил 106, объявляем "Ботву"
        return res;
    }
    public static void main(String[] args) {
        // Тестовые запуски игры и вывод результата
        System.out.println(new Game("83579", "24680").play());
        System.out.println(new Game("12345", "67890").play());
        System.out.println(new Game("13029", "42685").play());
    }
}