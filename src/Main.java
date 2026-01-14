package src;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(new Dog("Buddy", 3));
        animals.add(new Cat("Tom", 2));
        animals.add(new Bird("Tweety", 1));

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.eat();
            animal.sleep();
            System.out.println();
        }
    }
}
