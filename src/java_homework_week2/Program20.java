package java_homework_week2;

import java.util.Scanner;

/**
 * 20. Write a Java Program to print as below.
 * "+------------------------+"
 * "|                        |"
 * "|       CORNER STORE     |"
 * "|                        |"
 * "| 2015-03-29    04:38PM  |"
 * "|                        |"
 * "| Gallons:       10.870  |"
 * "| Price/gallon: $ 2.089  |"
 * "|                        |"
 * "| Fuel total: $ 22.71    |"
 * "|                        |"
 * "+------------------------+"
 */

public class Program20 {

    // Declared instance method with parameters to print data as given format
    public void displayData(String title, String date, String time, double glnValue, double glnPrice, float fuelTotal){

        // Print data with above format
        System.out.println("''+------------------------+''");
        System.out.println("''|                        |''");
        System.out.println("''|       " + title + "     |''");
        System.out.println("''|                        |''");
        System.out.println("''|  " + date + "  " + time + "   |''");
        System.out.println("''|                        |''");
        System.out.println("''| Gallons:       " + glnValue + "   |''");
        System.out.println("''| Price/gallon: " + "$ " + glnPrice + "  |''");
        System.out.println("''|                        |''");
        System.out.println("''| Fuel total:  " + "$ " + fuelTotal + "   |''");
        System.out.println("''|                        |''");
        System.out.println("''+------------------------+''");
    }

    // Declared Main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of store: ");  //e.g CORNER STORE
        String title = scanner.nextLine();
        System.out.print("Enter the date of receipt: ");  //e.g. 2015-03-29
        String date = scanner.nextLine();
        System.out.print("Enter the time: ");  //e.g 04:38PM
        String time = scanner.nextLine();
        System.out.print("Enter the gallons value: ");  //e.g. 10.870
        double glnValue = scanner.nextDouble();
        System.out.print("Enter the gallons price: ");  //e.g 2.089
        double glnPrice = scanner.nextDouble();
        System.out.print("Enter the fuel total: ");  //e.g. 22.71
        float fuelTotal = scanner.nextFloat();

        Program20 data = new Program20();
        data.displayData(title, date, time, glnValue, glnPrice, fuelTotal);
    }
}
