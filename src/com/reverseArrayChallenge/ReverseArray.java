package com.reverseArrayChallenge;

public class ReverseArray {

    //void methods must change the inserted object, but not create new object
    //reverse_incorrect is an example how void methods MUST NOT be created
    public static void reverse_incorrect(int[] array) {
        int[] reversedArray = new int[array.length];
        int index = 0;
        for(int i = array.length - 1; i >= 0; i--) {
            reversedArray[index] = array[i];
            index++;
        }
        System.out.println("Reversed Array is: ");
        printArray(reversedArray);
    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfIndex = array.length / 2;

        for(int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }

    public static void printArray(int[] arrayOfNumbers) {
        for(int i = 0; i < arrayOfNumbers.length; i++) {
            System.out.println(arrayOfNumbers[i]);
        }
    }
}
