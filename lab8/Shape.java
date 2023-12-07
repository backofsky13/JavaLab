package lab8;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
public abstract class Shape {
    protected Color color;
    protected int x, y;
    public Shape() {}
    public Shape(Color color, int x, int y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }
    abstract void draw(Graphics g);
}