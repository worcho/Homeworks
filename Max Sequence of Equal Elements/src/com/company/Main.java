package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int arr[] = Arrays.stream(input.nextLine().split(" "))
                .mapToInt(n -> Integer.parseInt(n))
                .toArray();

        int counter = 1;
        int bestCounter = 0;
        int element = 0;


        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                counter++;
            } else {
                if (counter > bestCounter) {
                    bestCounter = counter;
                    element = arr[i];
                }
                counter = 1;
            }
        }
        if (counter > bestCounter) {
            bestCounter = counter;
            element = arr[0];
        }

        for (int i = 0; i < bestCounter; i++) {
            System.out.printf("%s ",element);
        }
    }
}
