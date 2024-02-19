public class Person {

    // Instance variable;
    int myAge = 21;

    // Constructor
    public Person() {

        // Local variable
        String mySurname = "Talosig";

        // The instance variable "myAge" can be accessed in the constructor;
        System.out.println(myAge);
    }

    public void showAge() {
        // The instance variable "myAge" can be accessed in the method;
        System.out.println(myAge);

        // The local variable "mySurname" cannot be in this method;
        // Warning! This will result in an error!
        // System.out.println(mySurname);
    }

}