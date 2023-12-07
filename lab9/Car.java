package lab9;
class Car implements Nameable {
    private String brand;
    public Car(String brand) {
        this.brand = brand;
    }
    public String getName() {
        return brand;
    }
}