package org.example;

public class SortingArray {
    public static void main(String[] args) {
        int[] myArray = { 13, 7, 6, 45, 21, 9, 101, 102 };
        int temp = 0;

        System.out.println("Before sorting:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }

        for (int i = 0; i < myArray.length; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
    }
}

