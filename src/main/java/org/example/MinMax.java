package org.example;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {

        double maximum = 0;
        double minimum = 0;
        int iterationCount =0;


        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("Enter a number, or any character to exit: ");
            String nextEntry = sc.nextLine();
            try {
                double validNumber = Double.parseDouble(nextEntry);

                if (iterationCount == 0 || validNumber < minimum) {
                    minimum = validNumber;
                }

                if (iterationCount == 0 || validNumber > maximum) {
                    maximum = validNumber;
                }

                iterationCount++;
            } catch (NumberFormatException e) {

                break;
            }

        }
        if(iterationCount>0){
            System.out.println( "Minimum value: "+ minimum +  ", Maximum value: "+maximum);
        } else if (iterationCount==0){
            System.out.println( "No valid data entered");
        }

    }

}