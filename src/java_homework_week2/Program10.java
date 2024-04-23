package java_homework_week2;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 * Test Data: Input a number: 8
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Program10 {

    public static void main(String[] args) {
        // Scanner util library to get below inputs from user to convert into lower case
        Scanner input = new Scanner(System.in);
        System.out.print("Please input a particular number to show its multiplication table: ");
        int no = input.nextInt();
        Program10 obj = new Program10();
        obj.generateMultiplicationTable(no);
    }

    // Declared an instance method for multiplication table
    public void generateMultiplicationTable(int number){
        System.out.println(number + " X " + 1 + " = "
                + number);
        System.out.println(number + " X " + 2 + " = "
                + number * 2);
        System.out.println(number + " X " + 3 + " = "
                + number * 3);
        System.out.println(number + " X " + 4 + " = "
                + number * 4);
        System.out.println(number + " X " + 5 + " = "
                + number * 5);
        System.out.println(number + " X " + 6 + " = "
                + number * 6);
        System.out.println(number + " X " + 7 + " = "
                + number * 7);
        System.out.println(number + " X " + 8 + " = "
                + number * 8);
        System.out.println(number + " X " + 9 + " = "
                + number * 9);
        System.out.println(number + " X " + 10 + " = "
                + number * 10);

    }
}
