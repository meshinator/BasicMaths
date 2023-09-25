package io.java.sampleaddition;

public class Operator
{
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
        return num1 / num2;
}
}
