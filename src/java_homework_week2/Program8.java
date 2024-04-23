package java_homework_week2;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */
public class Program8 {

    // Declared static method for Calculating Area of triangle from its height and width
    public void findAreaOfTriangle(double height, double width){
        // Calculating Area of Triangle with below formula
        // Area = (width * height) / 2
        double area = (width * height) / 2;
        System.out.println("Area of Triangle is: " + area);

    }

    public static void main(String[] args) {
        // Scanner util library to get below inputs from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle:");
        double w = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double h = scanner.nextDouble();
        Program8 obj = new Program8();
        // Calling instance method with parameters
        obj.findAreaOfTriangle(h,w);
    }
}
