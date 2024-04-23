package java_homework_week2;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Program5 {

    // Main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter First Number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please Enter Second Number: ");
        int number2 = scanner.nextInt();

        // Create an object of class
        Program5 obj = new Program5();

        // To call the instance method with parameters by class object
        obj.addition(number1, number2);
        obj.subtraction(number1, number2);

        // To call the static method with parameter
        multiplication(number1, number2);
        division(number1, number2);
    }

    // Declare instance method with parameters for addition
    public void addition(int number1, int number2 ) {
        int additionAns = (number1 + number2);
        System.out.println("Addition of " + number1 + " and " + number2 + " is " + additionAns);
    }

    // Declare instance method with parameters for subtraction
    public void subtraction(int number1, int number2 ){
        int subtractionAns = (number1 - number2);
        System.out.println("Subtraction of " + number1 + " and " + number2 + " is " + subtractionAns);
    }

    // Declare static method multiplication method with parameter
    public static void multiplication(int number1, int number2 ){
        int mulAns = (number1 * number2);
        System.out.println("Multiplication of " + number1 + " and " + number2 + " is " + mulAns);
    }

    // Declare static method division method with parameter
    public static void division(int number1, int number2){
        int divAns = (number1 / number2);
        System.out.println("Division of " + number1 + " and " + number2 + " is " + divAns);
    }
}
