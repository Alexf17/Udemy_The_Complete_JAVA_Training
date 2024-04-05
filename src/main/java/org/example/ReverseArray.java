package org.example;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] myArray = inputArray();

        int[] reversedArray = reverseArray(myArray);

        System.out.print("Array in reverse Order: ");
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }

    public static int[] inputArray() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        int[] myArray = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index["+ i +"]: ");
            myArray[i] = input.nextInt();
        }

        return myArray;
    }

    public static int[] reverseArray(int[] myArray) {
        int[] reversedArray = new int[myArray.length];

        // copy elements from the original array to the reversed array in reverse order
        for (int i = 0; i < myArray.length; i++) {
            reversedArray[i] = myArray[myArray.length - 1 - i];
        }

        return reversedArray;
    }
}
