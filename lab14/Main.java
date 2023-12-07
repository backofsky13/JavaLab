package lab14; // Объявление пакета, в котором находится класс Main
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        // Создание и инициализация ArrayList с элементами типа String
        ArrayList<String> al = new ArrayList<>();
        al.add("2");
        al.add("3");
        // Создание объекта класса WaitList, который является обобщенным и может хранить элементы типа String
        WaitList<String> wl = new WaitList<>();
        // Добавление элементов в очередь wl
        wl.add("1");
        wl.add("2");
        wl.add("3");
        // Вывод текущего состояния очереди wl
        System.out.println(wl);
        // Удаление элемента из очереди wl
        System.out.println(wl.remove());
        // Вывод обновленного состояния очереди wl
        System.out.println(wl);
        // Проверка, является ли очередь wl пустой
        System.out.println(wl.isEmpty());
        // Проверка, содержит ли очередь wl элемент "Hi"
        System.out.println(wl.contains("Hi"));
        // Проверка, содержит ли очередь wl все элементы из ArrayList al
        System.out.println(wl.containsAll(al));
        System.out.println();
        // Создание объекта класса BoundedWaitList с максимальной емкостью 3
        BoundedWaitList<String> bwl = new BoundedWaitList<>(3);
        // Добавление элементов в ограниченную очередь bwl
        bwl.add("foo");
        bwl.add("foo2");
        bwl.add("bar");
        // Вывод текущего состояния ограниченной очереди bwl
        System.out.println(bwl);
        try {
            // Попытка добавить элемент в ограниченную очередь bwl, что может вызвать исключение
            bwl.add("bar2");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
        // Вывод текущего состояния ограниченной очереди bwl
        System.out.println(bwl);
        // Вывод максимальной емкости ограниченной очереди bwl
        System.out.println(bwl.getCapacity());
        System.out.println();
        // Создание объекта класса UnfairWaitList, который также является обобщенным
        UnfairWaitList<Integer> uwl = new UnfairWaitList<>();
        // Добавление элементов в нечестную очередь uwl
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        // Вывод текущего состояния нечестной очереди uwl
        System.out.println(uwl);
        // Удаление элемента "5" из нечестной очереди uwl
        uwl.remove(5);
        // Вывод обновленного состояния нечестной очереди uwl
        System.out.println(uwl);
        // Перемещение элемента "23" в конец нечестной очереди uwl
        uwl.moveToBack(23);
        // Вывод обновленного состояния нечестной очереди uwl
        System.out.println(uwl);
    }
}