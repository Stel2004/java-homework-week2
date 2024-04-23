package java_homework_week2;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 * Test Data:
 * Input first number: 125
 * Input second number: 24
 * Expected Output :
 * 125 + 24 = 149
 * 125 - 24 = 101
 * 125 x 24 = 3000
 * 125 / 24 = 5
 * 125 mod 24 = 5
 */
public class Program18 {

    // Declared instance method for calculations of two numbers
    public void calculationOfNumbers(int firstNumber, int secondNumber) {
        // calculation of two numbers
        int addition = firstNumber + secondNumber; // addition
        int subtraction = firstNumber - secondNumber; // subtraction
        int multiplication = firstNumber * secondNumber; // multiplication
        int division = firstNumber / secondNumber; // division
        int reminder = firstNumber % secondNumber; // /reminder

        System.out.println(firstNumber +" + "+ secondNumber +" = "+ addition);
        System.out.println(firstNumber +" - "+ secondNumber +" = "+ subtraction);
        System.out.println(firstNumber +" x "+ secondNumber +" = "+ multiplication);
        System.out.println(firstNumber +" / "+ secondNumber +" = "+ division);
        System.out.println(firstNumber +" mod "+ secondNumber +" = "+ reminder);

    }

    // Declared main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter First Number: ");  //e.g. decimal value:5
        int number1 = scanner.nextInt();
        System.out.print("Please Enter Second Number: ");  //e.g. decimal value:5
        int number2 = scanner.nextInt();

        // Creating object for class to access the instance method of class
        Program18 object = new Program18();
        object.calculationOfNumbers(number1, number2);

    }



}
