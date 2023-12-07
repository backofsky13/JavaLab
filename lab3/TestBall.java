package lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(75, 90);
        System.out.println(b1);
        b1.move(20, 25);
        System.out.println(b1);
    }
}