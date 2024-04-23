package java_homework_week2;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 * Expected Output
 * Binary number is: 101
 */
public class Program17 {

    // Convert decimal number to binary
    public static void decimalToBinary(int num) {
        String binaryNum = Integer.toBinaryString(num);
        System.out.println("Binary number is: " + binaryNum); //output: 101
    }

    // Declared Main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Input a Decimal Number: ");  //e.g. decimal value:5
        int number = scanner.nextInt();
        // Calling static method for converting decimal to binary
        decimalToBinary(number);
    }
}
