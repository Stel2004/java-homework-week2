package java_homework_week2;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 * Expected Output:
 * Sum of two binary numbers: 101
 */
public class Program16 {

    // Declared main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from user to find average
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first binary number: ");
        String firstNumber = scanner.nextLine();
        System.out.println("Please enter second binary number:");
        String secondNumber = scanner.nextLine();
        // Calling instance method for sum of two binary numbers

        Program16 object = new Program16();
        object.addBinaryNumber(firstNumber, secondNumber);
    }

    public void addBinaryNumber(String firstNum, String secondNum){
        int binaryNum1 = Integer.parseInt(firstNum, 2);
        int binaryNum2 = Integer.parseInt(secondNum, 2);

        int sum = binaryNum1 + binaryNum2;
        String  binaryResult = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary numbers: "+ binaryResult ); //result: 101
    }
}
