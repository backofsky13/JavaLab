package lab4;
public class Circle {
    private float radius;
    private float diameter;
    public Circle(float r, float d){
        this.radius = r;
        this.diameter = d;
    }
    public float getRadius(){
        return radius;
    }
    public float getDiameter(){
        return diameter;
    }
    public void setRadius(float r){
        this.radius = r;
    }
    public void setDiameter(float d){
        this.diameter = d;
    }
    public void print(){
        System.out.println("This circle is " + this.radius + " meters in radius " + "and " + this.diameter + " meters in diameter");
    }
}