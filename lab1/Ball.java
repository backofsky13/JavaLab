package lab1;
public class Ball {
    private String color;
    private int radius;
    public Ball(String c, int s){
        color = c;
        radius = s;
    }
    public Ball(String c){
        color = c;
        radius = 0;
    }
    public Ball(){
        color = "Red";
        radius = 0;
    }
    public void setColor(){
        this.color = color;
    }
    public void setSize(){
        this.radius = radius;
    }
    public String getColor(){
        return color;
    }
    public int getSize(){
        return radius;
    }
    public String toString(){
        return "The ball is " + this.color + " and " + this.radius + " meters in radius";
    }
    public void intoDiameterSize(){
        System.out.println(color + " ball is " + radius * 2 + " meters in diametr");
    }
}
