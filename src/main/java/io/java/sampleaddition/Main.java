package io.java.sampleaddition;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        //creating an object of the scanner class
       Scanner input = new Scanner(System.in);

        System.out.println("Please choose from : operator: +, -, *, or /");
        operator = input.next().charAt(0);

        System.out.println("Enter First number:");
        number1 = input.nextDouble();

        System.out.println("Enter Second number:");
        number2 = input.nextDouble();

       switch (operator)
       {
           // performs addition between numbers
           case '+':
               result = number1 + number2;
               System.out.println(number1 + " + " + number2 + " = " + result);
               break;

           // performs subtraction between numbers
           case '-':
               result = number1 - number2;
               System.out.println(number1 + " - " + number2 + " = " + result);
               break;

           // performs multiplication between numbers
           case '*':
               result = number1 * number2;
               System.out.println(number1 + " * " + number2 + " = " + result);
               break;

           // performs division between numbers
           case '/':
               result = number1 / number2;
               System.out.println(number1 + " / " + number2 + " = " + result);
               break;

           default:
               System.out.println("Invalid operator!");
               System.out.println("That's a good message");
               System.out.println("Welcome to the jungle may mangal");
               break;
       }

        input.close();
    }
       }



