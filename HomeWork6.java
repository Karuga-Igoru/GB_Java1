/*
* Java 1. Homework #6
*
* @author Igor Kargapolov
* @version 25.12.2021
*/
import java.util.Random;

class HomeWork6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Animal catMateus = new Cat("Mateus", "british fold", "ginger", 5);
        Animal catTriss = new Cat("Triss", "outbred", "tabby", 3);
        Animal dogKoritsa = new Dog("Koritsa", "dachshund", "dog", 4);
        Animal dogSweetie = new Dog("Sweetie", "Alabai", "pale", 7);
        Animal catSonya = new Cat("Sonya", "outbred", "black&white", 16);
        Animal[] domesticAnimals = {catMateus, catTriss, dogKoritsa, dogSweetie, catSonya};
        for (Animal a : domesticAnimals) {
            System.out.println(a.toString());
            a.run(rnd.nextInt(600) + 1);
            a.swim(rnd.nextInt(20) + 1);
        }

    }
}   

class Dog extends Animal {
    Dog(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    @Override
    void swim(int swimLength) {
        System.out.println(swimLength <= 10 ? name + " swimmed " + swimLength + " m" : 
                name + " swimmed 10 m and tired");  
    }

    @Override
    void run(int runLength) {
        System.out.println(runLength <= 500 ? name + " run " + runLength + " m" : 
                name + " run 500 m and tired");  
    }
}

class Cat extends Animal {
    Cat(String name, String breed, String color, int age) {
        super(name, breed, color, age);
    }

    @Override
    void swim(int swimLength) {
        System.out.println(name + " don't wanna swim. Pffffffsh!");  
    }

    @Override
    void run(int runLength) {
        System.out.println(runLength <= 400 ? name + " run " + runLength + " m" : 
                name + " run 400 m and tired");  
    }
}

abstract class Animal {
    protected String name;
    protected String breed;
    protected String color;
    protected int age;

    Animal(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }

    abstract void swim(int swimLength);
    
    abstract void run(int runLength);

    @Override
    public String toString() {
        return "Name: " + name + 
                "\nBreed: " + breed +
                "\nColor: " + color + 
                "\nAge: " + age; 
    }
}