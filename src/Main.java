package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> animals = new ArrayList<>();

        System.out.print("Please enter the password: ");
        if (!scanner.nextLine().equals("ROBERTSUN50")) {
            System.out.println("Incorrect password. Access denied.");
            scanner.close();
            System.exit(0);
        }

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
