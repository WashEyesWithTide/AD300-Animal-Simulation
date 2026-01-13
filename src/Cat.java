package src;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }

    public void laze() {
        System.out.println(getName() + " lazes.");
    }
}
