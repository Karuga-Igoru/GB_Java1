/*
* Java 1. Homework #2
*
* @author Igor Kargapolov
* @version 12.12.2021
*/
class HomeWork2 {
    public static void main (String[] args) {
        //Added more checks for testing
        System.out.println("Task #1 'Sum of two numbers between 10 and 20'");
        System.out.println("5 + 2 " + compareSum(5, 2)); 
        System.out.println("10 + 2 " + compareSum(10, 2));
        System.out.println("10 + 10 " + compareSum(10, 2));
        System.out.println("19 + 10 " + compareSum(19, 10) + "\n");
        System.out.println("Task #2 'Is the number positive?'");
        System.out.println("-5 Is positive number? - " + isPositive( -5));
        System.out.println("0 Is positive number? - " + isPositive( 0));
        System.out.println("11 Is positive number? - "
            + isPositive( 11) + "\n");
        System.out.println("Task #3 'Is the number negative?'");
        System.out.println("-3 Is negative number? - " + isNegative( -3));
        System.out.println("0 Is negative number? - " + isNegative( 0));
        System.out.println("10 Is negative number? - "
            + isNegative( 10) + "\n");
        System.out.println("Task #4 'Multipling string'");
        System.out.println("Typing 'this is the way' * 5: \n"
            + multiplyTheString( "this is the way", 5));
        System.out.println("Task #5 'Is this a leap year? '");
        System.out.println("Is 1987 a leap year? - "+isLeapYear(1987));
        System.out.println("Is 1988 a leap year? - "+isLeapYear(1988));
        System.out.println("Is 1900 a leap year? - "+isLeapYear(1900));
        System.out.println("Is 2000 a leap year? - "+isLeapYear(2000));
    }
    static boolean compareSum(int x, int y) {
        return x + y >=10 & x + y <= 20 ? true : false;
    }
    static String isPositive(int a) {
        return a >= 0 ? "Positive" : "Negative";
    }
    static boolean isNegative(int a) {
        return  a < 0 ? true : false;
    }
    static String multiplyTheString(String s, int a) {
        String sStart = "";
        for (int i = a; i > 0 ; i--){
            sStart = sStart + s + "\n"; //"\n" is optional and used for comfort
        }
        return sStart;
    }
    static boolean isLeapYear(int year) {
        boolean leapYear = false;
        int remainderFromFour = year % 4;
        int remainderFromOneHundred = year % 100;
        int remainderFromFourHundred = year % 400;
        if (remainderFromFour == 0) {
            leapYear = true;
        } if (remainderFromOneHundred == 0) {
            leapYear = false;
        } if (remainderFromFourHundred == 0) {
            leapYear = true;
        }
        return leapYear;
    }
}