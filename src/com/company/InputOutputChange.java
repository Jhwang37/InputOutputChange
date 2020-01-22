package com.company;

import java.util.Scanner;

public class InputOutputChange {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first temperature: ");
        double firstTemp = scan.nextDouble();

        System.out.println("Enter the second temperature: ");
        double secondTemp = scan.nextDouble();

        double avg = (firstTemp + secondTemp) / 2;
        System.out.println("The average of your temperatures = " + avg);
    }
}
