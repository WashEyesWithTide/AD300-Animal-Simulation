package src;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println(name + " eats.");
    }

    public void sleep() {
        System.out.println(name + " sleeps.");
    }

    public void makeSound() {} //Overridden in subclasses

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        makeSound();
    }

}