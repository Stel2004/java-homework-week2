package java_homework_week2;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Program13 {

    // Declared main method
    public static void main(String[] args) {
        // Scanner util library to get below inputs from user to find average
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.println("Please enter second number:");
        double num2 = scanner.nextDouble();
        System.out.println("Please enter third number:");
        double num3 = scanner.nextDouble();

        Program13 obj = new Program13();
        obj.averageOfNumbers(num1, num2, num3);

    }

    // Declared Instance method for calculating average of three numbers
    public void averageOfNumbers(double n1, double n2, double n3){
        // Calculate the average of entered numbers
        double average = ((n1 + n2 + n3) / 3);
        System.out.println("The average of the entered numbers is: " + average);

    }
}
