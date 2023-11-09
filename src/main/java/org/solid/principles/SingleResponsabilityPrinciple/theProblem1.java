package org.solid.principles.SingleResponsabilityPrinciple;

import java.util.Scanner;

public class theProblem1 {
    public static void main(String[] args) {
        System.out.println("Welcome to the Application!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");

        String firstNumber = scanner.nextLine();

        System.out.println("Enter the second number: ");

        String secondNumber = scanner.nextLine();

        scanner.close();

        int firstInteger = 0;

        int secondInteger = 0;

        if (firstNumber == null) {
            System.out.println("First number is not valid...");
        }
        try {

            secondInteger = Integer.parseInt(secondNumber);

        } catch (NumberFormatException nfe) {
            System.out.println("Second number is not valid...");
            return;

        }

        int result = firstInteger + secondInteger;

        System.out.println("The result is: " + result);
        System.out.println("End of the application!");
    }
}