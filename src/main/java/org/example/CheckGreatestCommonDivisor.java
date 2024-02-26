package org.example;

public class CheckGreatestCommonDivisor {
    public static void main(String[] args) {
        int first = 24;
        int second = 36;
        while (second!=0){
            int temp = second;
            second= first%second;
            first= temp;
        }
        System.out.println(first);

        //////////////////

        for(int i =1;i<=8;i++){
            System.out.println(" ");
            for(int j =8;j>=i;j--){
                System.out.print("*");
            }
        }

    }
}
