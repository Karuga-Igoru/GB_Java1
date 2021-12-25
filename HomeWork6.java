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
        IAnimal catMateus = new Cat("Mateus", "british fold", "ginger", 5);
        IAnimal catTriss = new Cat("Triss", "outbred", "tabby", 3);
        IAnimal dogKoritsa = new Dog("Koritsa", "dachshund", "dog", 4);
        IAnimal dogSweetie = new Dog("Sweetie", "Alabai", "pale", 7);
        IAnimal catSonya = new Cat("Sonya", "outbred", "black&white", 16);
        IAnimal[] domesticAnimals = {catMateus, catTriss, dogKoritsa, dogSweetie, catSonya};
        for (IAnimal a : domesticAnimals) {
            System.out.println(a.toString());
            a.run(rnd.nextInt(600) + 1);
            a.swim(rnd.nextInt(20) + 1);
            System.out.println();
        }
        System.out.println("There are " + 
                Dog.getCount() + " dogs, " +
                "and " + Cat.getCount() + " cats" +
                "\nTotal: " + (Dog.getCount() + Cat.getCount()));
    }
}   

class Dog extends Animal {
    private static int count;
    Dog(String name, String breed, String color, int age) {
        super(name, breed, color, age);
        count++;
        canSwim = true;
        maxSwim = 10;
        maxRun = 500;
    }

    @Override
    public void swim(int swimLength){
        if (canSwim == true) {
            if (maxSwim > swimLength) {
                System.out.println(name + " successfully swimmed " + swimLength + " m");
            } else {
                System.out.println(name + " tired after " + maxSwim + " m");
            }
        } else {
            System.out.println(name + " not swim.");
        }
    }

    @Override
    public void run(int runLength) {
        System.out.println(runLength <= maxRun ? name + " run " + runLength + " m" : 
                name + " run " + maxRun + " m and tired");  
    }

    static int getCount(){
        return count;
    }
}

class Cat extends Animal {
    private static int count;
    Cat(String name, String breed, String color, int age) {
        super(name, breed, color, age);
        count++;
        canSwim = false;
        maxSwim = 0;
        maxRun = 400;
    }

    @Override
    public void swim(int swimLength){
        if (canSwim == true) {
            if (maxSwim > swimLength) {
                System.out.println(name + " successfully swimmed " + swimLength + " m");
            } else {
                System.out.println(name + " tired after " + swimLength + " m");
            }
        } else {
            System.out.println(name + " not swim.");
        }
    }

    @Override
    public void run(int runLength) {
        System.out.println(runLength <= maxRun ? name + " run " + runLength + " m" : 
                name + " run " + maxRun + " m and tired");  
    }
    
    static int getCount() {
        return count;
    }

}

interface IAnimal {
    void swim(int swimLength);
    void run(int runLength);
}

abstract class Animal implements IAnimal {
    protected String name;
    protected String breed;
    protected String color;
    protected int age;
    protected boolean canSwim;
    protected int maxRun;
    protected int maxSwim;

    Animal(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.canSwim = canSwim;
    }

    @Override
    public String toString() {
        return "Name: " + name + 
                "\nBreed: " + breed +
                "\nColor: " + color + 
                "\nAge: " + age; 
    }

    
}