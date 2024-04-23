package java_homework_week2;

/**
 * 4. Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Program4 {
    // 4.1. Declare instance variables
    String firstName = "Smita";
    String lastName = "Vaja";
    // 4.1. Declare static variables
    static String city = "London";
    static String postcode = "HA9 7AJ";

    // 4.2. Declare instance method
    // myInstanceMethod1() is instance method (Non-static method)
    public void myInstanceMethod1(){
        // Create instance of class
        Program4 obj = new Program4();
        // Called instance of class into instance method
        //System.out.println("Called instance/object of class directly into instance method: ");
        System.out.println("Student Name is " + obj.firstName + " " + obj.lastName );

        // 4.4. Called static variable directly
        //System.out.println("Called static variable directly into instance method: ");
        System.out.println("City :" + city + " and Postcode :" + postcode );

        // 4.4. Called instance variable directly
        //System.out.println("Called instance variable directly into instance method: ");
        System.out.println("Student Name is " + firstName + " " + lastName);

        // 4.4. Called class object directly
        System.out.println("City :" + Program4.city + " and Postcode :" + Program4.postcode );

    }

    // 4.3 Declare static method
    // myStaticMethod() is static method
    public static void myStaticMethod(){
        // 4.4. Called static variable into static method
        System.out.println(" Static Variable called: ");
        System.out.println("City is " + city);
        System.out.println("Postcode is " + postcode);

        System.out.println("City is " + Program4.city);
        System.out.println("Postcode is " + Program4.postcode);

        // 4.4. Called Instance variable into static method
        Program4 staticObj1 = new Program4();
        System.out.println("Student Name is " + staticObj1.firstName + " " + staticObj1.lastName);


    }

    // 4.5. Declare Main Method
    public static void main(String[] args) {

        // Calling static method
        myStaticMethod();
        Program4.myStaticMethod();

        // Calling instance method
        Program4 mainVar = new Program4();
        mainVar.myInstanceMethod1();

    }
}
