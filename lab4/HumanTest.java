package lab4;
public class HumanTest {
    public static void main(String[] args) {
        Head head = new Head("Блондин", "Голубые");
        Leg leftLeg = new Leg(90); // Предположим, что длина ноги 90 см
        Leg rightLeg = new Leg(90); // Предположим, что длина ноги 90 см
        Hand leftHand = new Hand(5); // Предположим, что 5 пальцев на руке
        Hand rightHand = new Hand(5); // Предположим, что 5 пальцев на руке
        Human person = new Human(head, leftLeg, rightLeg, leftHand, rightHand);
        person.getInfo();
    }
}
