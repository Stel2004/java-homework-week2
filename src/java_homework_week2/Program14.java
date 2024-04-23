package java_homework_week2;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 *  Test Data:
 *  Width = 5.5 Height = 8.5
 *  Expected Output:
 *  Area is 5.6 * 8.5 = 47.60
 *  Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Program14 {

    // Declared main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from user to find average
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter height of rectangle: ");
        float height = scanner.nextFloat(); // store data into instance variable
        System.out.println("Please enter width of rectangle:");
        float width = scanner.nextFloat(); // store data into static variable

        // Called instance method
        Program14 obj = new Program14();
        obj.findArea(width, height);
        // Called static method
        findPerimeter(width, height);

    }

    // Declared instance method with no return type, no parameter to find the Area of rectangle
    public void findArea(float width, float height) {
        double area =  width * height;
        // Output as Area is 5.6 * 8.5 = 47.60
        System.out.println("Area is " + width + " * " + height + " = " + area);
    }

    // Declared static method with no return type, no parameter to find the perimeter of the rectangle
    public static void findPerimeter(float width, float height) {

        double perimeter = (2 * (height + width));
        // Output as Perimeter is 2 * (5.6 + 8.5) = 28.20
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeter);
    }
}
