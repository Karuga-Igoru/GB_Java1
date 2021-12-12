/*
* Java 1. Homework #1
*
* @author Igor Kargapolov
* @version 11.12.2021
*/
class HomeWork1 {
    public static void main (String[] args) {
        System.out.println("Homework #1");
        System.out.println("Ex #2 'Print three words'");
        printThreeWords();
        System.out.println("Ex #3 'Sign of sum'");
        System.out.println("Sign of sum 5+3 is " + checkSumSign(5, 3));
        System.out.println("Ex #4 'Color of random number'");
        System.out.println(printColor((int) (Math.random() * 1000),
            (int) (Math.random() * -1000)) + "\n");
        System.out.println("Ex #5 'Compairing the random numbers'");
        System.out.println(compareNumbers((int) (Math.random() * 10),
            (int) (Math.random() * -10)));
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple" +"\n");
    }
    static String checkSumSign(int a, int b) {
        return a + b >= 0 ? "Positive\n" : "Negative\n";
    }
    static String printColor(int a, int b) {
        int value = a + b;
        String colorOfNumber = "Red";
        if (value >= 0 & value <= 100) {
            colorOfNumber = "Yellow";
        } if (value > 100) {
            colorOfNumber = "Green";
        }
        return colorOfNumber;
    }
    static String compareNumbers(int a, int b) {
        return a >= b ? "a >= b" : "a < b";
    }
}

