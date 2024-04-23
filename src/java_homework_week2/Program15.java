package java_homework_week2;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */
public class Program15 {

    // Declared static method
    public static void main(String[] args) {
        // Scanner util library to get below inputs from user to find average
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        double first = scanner.nextDouble();
        System.out.println("Please enter second number:");
        double second = scanner.nextDouble();

        // Calling static method for swapping two numbers without temporary variable
        swapTwoNumbers(first, second);
        // Calling instance method for swapping two numbers with temporary variable
        Program15 obj = new Program15();
        obj.swapTwoNumbersWithTemp(first, second);

    }

    // Static method with no return type, no parameters for swapping 2 numbers
    public static void swapTwoNumbersWithTemp(double first, double second){

        System.out.println("********* Swapping two Numbers By Using Temporary variable  *********");
        System.out.println("Numbers before swapping:");
        System.out.println("The first number: " + first + " and The second number: " + second );

        // Swap two numbers with the use of temp variable
        double temp = first;
        first = second;
        second = temp;

        System.out.println("Numbers after swapping:");
        System.out.println("The first number: " + first + " and The second number: " + second );

    }

    // Static method with no return type, no parameters for swapping 2 numbers without using temporary variable
    public static void swapTwoNumbers(double number1, double number2){

        System.out.println("******* Swapping two Numbers Without Using Temporary variable ********");
        System.out.println("Numbers before swapping:");
        System.out.println("The first number: " + number1 + " and The second number: " + number2 );

        // Swapping numbers without using extra variable
        number1 = number1 + number2;
        number2 = number1 - number2;
        number1 = number1 - number2;


        System.out.println("Numbers after swapping:");
        System.out.println("The first number: " + number1 + " and The second number: " + number2 );


    }
}
