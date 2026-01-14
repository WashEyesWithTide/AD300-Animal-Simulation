package src;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof!");
    }

    public void fetch() {
        System.out.println(getName() + " fetches.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        fetch();
    }
}
