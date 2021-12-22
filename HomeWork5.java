/*
* Java 1. Homework #5
*
* @author Igor Kargapolov
* @version 22.12.2021
*/
import java.util.Scanner;
class HomeWork5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] persArray = new Person[6];
        persArray[0] = new Person("Yoda", "Grandmaster", "yodamaster@corusant.com",
                "1571189935", 10, 875);
        persArray[1] = new Person("Mace Windu", "Master", "iwantviolet@corusant.com",
                "1975260163", 1000000, 45);
        persArray[2] = new Person("Obiwan Kenobi", "Master", "hellothere@corusant.com",
                "1778339185", 40000, 40);
        persArray[3] = new Person("Kyle Katarn", "Knight", "guywithlightsaber@yavin.com",
                "1687510130", 50000, 39);
        persArray[4] = new Person("Anakin Skywalker", "Knight", "dontlikesand@padme.com",
                "1796264781", 30000, 27);
        persArray[5] = new Person("Ahsoka Tano", "Padawan", "snips@corusant.com",
                "1994161054", 10000, 18);
        System.out.print("Enter age limit:");
        int chooseAge = sc.nextInt();
        for (int i = 0; i < persArray.length; i++){
            if (persArray[i].getAge() > chooseAge - 1) {
                System.out.println(persArray[i]);
            }
        }
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    Person (String fullName, String position, String email, String phone,
            int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public String toString() {
        return "Name: " + fullName +"\nPosition: " + position + "\nEmail: " +
                email + "\nPhone: " + phone + "\nSalary: " + salary + "\nAge: " + age +"\n";
    }
    public int getAge() {
        return age;
    }
}