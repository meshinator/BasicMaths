package io.java.sampleaddition;  // This line declares the package name for the Java class.

import java.util.Scanner;

public class mainwa extends Operator {  // This line defines a Java class named "mainwa" that extends another class called "Operator."

    public static void main(String[] args) {  // This line is the main method, which is the entry point of the program.
        Scanner scanner = new Scanner(System.in);  // This line creates a new Scanner object for user input.

        System.out.println("Welcome to the Basic Calculator!");  // This line prints a welcome message.
        System.out.print("Enter first number: ");  // This line prompts the user to enter the first number.
        double num1 = scanner.nextDouble();  // This line reads the first double value entered by the user.

        System.out.print("Enter second number: ");  // This line prompts the user to enter the second number.
        double num2 = scanner.nextDouble();  // This line reads the second double value entered by the user.

        System.out.println("Select an operation:");  // This line prompts the user to select an operation.

        System.out.println("1. Addition");  // This line displays the option for addition.
        System.out.println("2. Multiplication");  // This line displays the option for multiplication.
        System.out.println("3. Division");  // This line displays the option for division.

        int choice = scanner.nextInt();  // This line reads the user's choice of operation as an integer.

        double result = 0;  // This line initializes a variable to store the result of the chosen operation.

        switch (choice) {  // This line starts a switch statement based on the user's choice.
            case 1:  // If the user chose 1 (Addition)...
                result = add(num1, num2);  // ...call the "add" method with num1 and num2 and store the result.
                break;  // Exit the switch statement.
            case 2:  // If the user chose 2 (Multiplication)...
                result = multiply(num1, num2);  // ...call the "multiply" method with num1 and num2 and store the result.
                break;  // Exit the switch statement.
            case 3:  // If the user chose 3 (Division)...
                result = divide(num1, num2);  // ...call the "divide" method with num1 and num2 and store the result.
                break;  // Exit the switch statement.
            default:  // If the user's choice is not 1, 2, or 3...
                System.out.println("Invalid choice.");  // ...display an error message.
                break;  // Exit the switch statement.
        }

        System.out.println("Result: " + result);  // This line prints the result of the chosen operation.

        scanner.close();  // This line closes the Scanner object to release system resources.
    }
}
