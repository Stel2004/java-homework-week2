package java_homework_week2;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Program1 {

    // 1.1 Declare Instance variable
    int a = 10;
    int b = 20;

    // 1.2 Declare Instance Method
    public void instanceMethod(){
        System.out.println("Prime Test");
        // 1.3 Called Instance variable use inside the instance method
        System.out.println(a);
        System.out.println(b);
    }

    // 1.4 Declare main method
    public static void main(String[] args) {
        // Class object created
        Program1 obj = new Program1();
        // 1.5 Called instance method of class into main method
        obj.instanceMethod();
    }
}
