package lab6;
public class FurnitureShop {
    public static void main(String[] args) {
        Table table = new Table("Wooden", 150, "Table");
        Wardrobe wardrobe = new Wardrobe("Wooden", 200, "Wardrobe");
        table.getInfo();
        wardrobe.getInfo();
    }
}