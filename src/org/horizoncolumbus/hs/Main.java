package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.print("Enter Array Size: ");

        int ArraySize = myObj.nextInt();

        int[] numbers = new int[ArraySize];

        for(int i = 0; i < ArraySize; i++){
            System.out.print("Enter Array Number: ");
            numbers[i] = myObj.nextInt();
        }

        int sum = 0;

        for(int i = 0; i < ArraySize; i++){
            sum = sum + numbers[i];
        }

        System.out.println(sum);
    }
}
