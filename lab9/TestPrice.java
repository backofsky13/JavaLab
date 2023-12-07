package lab9;
public class TestPrice {
    public static void main(String[] args) {
        Phone phone = new Phone(1200);
        TV tv = new TV(550);
        Laptop laptop = new Laptop(1000);
        System.out.println("This phone costs " + phone.getPrice() + "$");
        System.out.println("This TV costs: " + tv.getPrice() + "$");
        System.out.println("This laptop costs: " + laptop.getPrice() + "$");
    }
}