package java_homework_week2;

import java.util.Scanner;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */
public class Program19 {

    // Declared main method
    public static void main(String[] args) {

        // Scanner util library to get below inputs from users
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string in uppercase: "); //e.g. THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
        String str = scanner.nextLine();

        // Calling instance method with class object
        Program19 val = new Program19();
        val.upperCaseToLowerCase(str);

    }

    // Declared instance method with parameters for covert string into lower case
    public void upperCaseToLowerCase(String str){
        String lowerStr = str.toLowerCase(); // e.g. the quick brown fox jumps over the lazy dog
        System.out.print("Above string in lowercase: ");
        System.out.print(lowerStr);
    }
}
