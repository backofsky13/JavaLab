package lab6;
public abstract class Dog {
    private String breed;
    public Dog(String breed) {
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed() {
        this.breed = breed;
    }
    public void infoDog() {
        System.out.println("The dog is " + breed + " breed");
    }
}