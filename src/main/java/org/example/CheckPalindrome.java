package org.example;

public class CheckPalindrome {
    public static void main(String[] args) {
        int number = 16161;
        int palindrome = number;
        int reverse =0;
        while (palindrome!=0) {
            int remainder = palindrome%10;
            reverse = reverse*10+remainder;
            palindrome= palindrome/10;

        }if(number==reverse) System.out.println(number+" is palindrome");

    }
}
