package lab6;
public class TestDish {
    public static void main(String[] args) {
        Cup cup = new Cup("aluminum", 30, "Cup");
        Plate plate = new Plate("steel", 50, "Plate");
        cup.getInfo();
        plate.getInfo();
    }
}