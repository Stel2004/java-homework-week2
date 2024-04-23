package java_homework_week2;


/**
 * 2. Write a Java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Program2 {

    // 2.1. Declare static variables
    static int a = 5;
    static int b = 10;
    static String name = "Smita";

    // 2.2 Declare static Method
    public static void myMethod(){

        // 2.3. Called static variable into static method
        System.out.println("Your Name is " + name);
        System.out.println("First Number is " + a + " and Second Number is " + b);

    }

    // 2.4. Declare main method
    public static void main(String[] args) {
        // 2.5 Called static method into main method
        System.out.println("Calling static method: ");
        myMethod();

    }
}
