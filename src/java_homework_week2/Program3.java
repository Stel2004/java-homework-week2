package java_homework_week2;

/**
 * 3. Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program3 {

    // 3.1. Declare instance variable
    String firstName = "Smita";
    // 3.1. Declare static variable
    static int number = 100;

    // 3.2. Declare instance method
    // myInstanceMethod3() is instance method (Non-static method)
    public void myInstanceMethod3(){
        // Create instance of class
        Program3 obj = new Program3();
        // Called instance of class into instance method
        System.out.println(obj.firstName);

        // 3.4. Called static variable directly
        System.out.println(number);

        // 3.4. Called instance variable directly into instance method
        System.out.println("Called instance variable directly into instance method: " + firstName);

        // 3.4. Called class object directly
        System.out.println(Program3.number);

    }

    // 3.3 Declare static method
    // myStaticMethod() is static method
    public static void myStaticMethod(){
        // 3.4. Called static variable into static method
        System.out.println(" Static Variable called: " + number);
        System.out.println(" From Static method to called instance variable: " + Program3.number);

        // 3.4. Called Instance variable into static method
        Program3 staticObj = new Program3();
        System.out.println(staticObj.firstName);

    }

    // 3.5. Declare Main Method
    public static void main(String[] args) {

        // 3.6. Call static methods into the Main method.
        myStaticMethod();
        Program3.myStaticMethod();

        // 3.6. Called Instance method into main method.
        Program3 obj3 = new Program3();
        obj3.myInstanceMethod3();
    }
}
