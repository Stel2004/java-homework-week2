package java_homework_week2;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r)
 */
public class Program6 {

    static double PI = 3.142;
    // main method
    public static void main(String[] args) {
        // Scanner util library to get below inputs from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter radious value of circle: ");
        int radious = scanner.nextInt();
        Program6 obj = new Program6();
        obj.findAreaOfRadious(radious);
    }

    // Declare instance method to calculate area of circle
    public void findAreaOfRadious(int radious) {
        // calculating the area of the circle
        double area = (PI * radious * radious);
        System.out.println("Given radious is : " + radious);
        System.out.println("Area of the circle is: " + area);
    }
}
