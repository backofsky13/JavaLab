package lab6;
abstract class Dish {
    private String type;
    private String material;
    private int size;
    public Dish(String material, int size, String type) {
        this.material = material;
        this.size = size;
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public String getMaterial() {
        return material;
    }
    public int getSize() {
        return size;
    }
    public void getInfo(){
        System.out.println(type + " is " + material + " and " + size + " size");
    }
}