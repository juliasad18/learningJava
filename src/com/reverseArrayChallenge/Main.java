package com.reverseArrayChallenge;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println("Array is: " + Arrays.toString(array));

        ReverseArray.reverse(array);
        System.out.println("Reversed Array is: " + Arrays.toString(array));

    }
}
