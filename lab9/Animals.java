package lab9;
class Animal implements Nameable {
    private String name;
    public Animal(String species) {
        this.name = species;
    }
    public String getName() {
        return name;
    }
}