package lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Red", 13);
        Ball b2 = new Ball("Blue", 1);
        Ball b3 = new Ball("Green", 7);
        System.out.println(b1);
        b1.intoDiameterSize();
        b2.intoDiameterSize();
        b3.intoDiameterSize();
    }
}