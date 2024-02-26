package org.example;

public class NumbersToWords {
    public static void main(String[] args) {
        String result = "";
        int number = 12345;
        int digit, temp;
        for (int i = 1, j = 10; number > 0; i *= 10, j *= 10) {
            temp = number % j;
            digit = temp / i;
            for (int k = 0; k < 10; k++) {
                if (digit == k) {
                    String word = switch (digit) {
                        case 0 -> "zero";
                        case 1 -> "one";
                        case 2 -> "two";
                        case 3 -> "three";
                        case 4 -> "four";
                        case 5 -> "five";
                        case 6 -> "six";
                        case 7 -> "seven";
                        case 8 -> "eight";
                        case 9 -> "nine";
                        default -> "";
                    };
                    result = word + " " + result;
                }
            }
            number -= temp;
        }
        System.out.println(result);
    }

}
