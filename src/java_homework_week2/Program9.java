package java_homework_week2;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case
 */
public class Program9 {

    // Declared instance method to convert upper case to lower case
    public void convertUpperCaseToLowerCase(String name){
        //Convert upper case string into lower case string
        String convertedString = name.toLowerCase();
        System.out.println("The given upper case string is converted into lower case: " + convertedString);
    }

    // Declared main method
    public static void main(String[] args) {
        // Scanner util library to get below inputs from user to convert into lower case
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string in uppercase: ");
        String upperCaseString = input.nextLine();
        // Created instance object and calling the instance method
        Program9 obj = new Program9();
        obj.convertUpperCaseToLowerCase(upperCaseString);
    }
}
