package lab4;
class Head {
    private String hairColor;
    private String eyeColor;
    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }
    public String getHairColor() {
        return hairColor;
    }
    public String getEyeColor() {
        return eyeColor;
    }
}
class Leg {
    private int length;
    public Leg(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }
}
class Hand {
    private int fingers;
    public Hand(int fingers) {
        this.fingers = fingers;
    }
    public int getFingers() {
        return fingers;
    }
}
class Human {
    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;
    public Human(Head head, Leg leftLeg, Leg rightLeg, Hand leftHand, Hand rightHand) {
        this.head = head;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.leftHand = leftHand;
        this.rightHand = rightHand;
    }
    public void getInfo() {
        System.out.println("Информация о человеке:");
        System.out.println("Цвет волос: " + head.getHairColor());
        System.out.println("Цвет глаз: " + head.getEyeColor());
        System.out.println("Длина левой ноги: " + leftLeg.getLength() + " см");
        System.out.println("Длина правой ноги: " + rightLeg.getLength() + " см");
        System.out.println("Количество пальцев на левой руке: " + leftHand.getFingers());
        System.out.println("Количество пальцев на правой руке: " + rightHand.getFingers());
    }
}