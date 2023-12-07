package lab8;
import java.awt.*;
public class Triangle extends Shape {
    private int sideLength;
    public Triangle(Color color, int x, int y, int sideLength) {
        super(color, x, y);
        this.sideLength = sideLength;
    }
    @Override
    void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = {x, x + sideLength, x - sideLength};
        int[] yPoints = {y - sideLength, y + sideLength, y + sideLength};
        g.fillPolygon(xPoints, yPoints, 3);
    }
}