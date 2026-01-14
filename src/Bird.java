package src;

public class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Chirp!");
    }

    public void fly() {
        System.out.println(getName() + " flys.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        fly();
    }
}
