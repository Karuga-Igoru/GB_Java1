/*
* Java 1. Homework #3
*
* @author Igor Kargapolov
* @version 15.12.2021
*/
import java.util.Arrays;
import java.util.Random;
class HomeWork3 {
    public static void main(String[] args) {
        System.out.println("HomeWork #3");
        System.out.println("\nTask #1 Create array filled with 1 and 0," + 
            " and invert 1 to 0");
        invertArray();
        System.out.println("\nTask #2 Create array and fill it with number series");
        createAndFillArray();
        System.out.println("\nTask #3 Create array of int and *2 all numbers that <6");
        multiplyLowElements();
        System.out.println("\nTask #4 Fill diagonal elements of two-dimensional array with 1");
        fillDiagonalsOfArray();
        System.out.println("\nTask #5 Create array with length 17 filled with 0");
        System.out.println(Arrays.toString(createArrFromArg(17, 0)));
        System.out.println("\nTask #6 Find minimum and maximum of array");
        findArrExtremum();
    }
    static void invertArray() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array [i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println("Array with inverted 0 and 1");
        System.out.println(Arrays.toString(array));
    }
    static void createAndFillArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }
    static void multiplyLowElements() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++){
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    static void fillDiagonalsOfArray() {
        int [][] array = new int[5][5];
        int n = array.length;
        for (int i = 0; i < array.length; i++){
            array[i][i] = 1;
            n = n - 1; 
            array[i][n] = 1;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        System.out.println();
        }
    }
    static int[] createArrFromArg(int len, int initialValue) {
        int [] array = new int [len];
        for (int i = 0; i < len; i++){
            array[i] = initialValue;
        }
        return array;
    }
    static void findArrExtremum() {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            array [i] = random.nextInt(50);
        }
        System.out.println(Arrays.toString(array));
        int aMin = array[0];
        int aMax = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > aMax) {
                aMax = array[i];
            }
            if (array[i] < aMin) {
                aMin = array[i];
            }
        }
        System.out.println("Minimum of Array is " + aMin);
        System.out.println("Maximum of Array is " + aMax);
    }
}