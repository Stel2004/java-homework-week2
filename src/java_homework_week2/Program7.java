package java_homework_week2;

import java.util.Scanner;

/**
 * 7. Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C)
 */
public class Program7 {

    // Declare instance method for convert temperature in degree Fahrenheit To degree Celsius
   public void convertFahrenheitToCelsius(float temp) {
        // calculating the Temperature in Degree Celsius
        double ans = ((temp - 32) * 5/9);
        System.out.println("Temperature in Degree Celsius: " + ans);
   }

   // Declare Main method
    public static void main(String[] args) {
        // Scanner util library to get below inputs from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter temperature value in degree Fahrenheit: ");
        int temperature = scanner.nextInt();
        Program7 obj = new Program7();
        // Calling instance method
        obj.convertFahrenheitToCelsius(temperature);
    }

}
