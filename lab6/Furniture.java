package lab6;
public abstract class Furniture {
    private String material;
    private String type;
    private int price;
    public Furniture(String material, String type, int price){
        this.material = material;
        this.type = type;
        this.price = price;
    }
    public String getMaterial(){
        return material;
    }
    public int getPrice(){
        return price;
    }
    public String getType(){
        return type;
    }
    public void getInfo(){
        System.out.println("The " + type + " costs " + price + "$");
    }
}