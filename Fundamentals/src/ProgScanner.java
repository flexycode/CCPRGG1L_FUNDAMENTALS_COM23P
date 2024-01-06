package Fundamentals;

import java.util.Scanner;

public class ProgScanner {
 
    public static void main(String[] args) {

        // Variable Declarations
        int x, y, sum;
        String programmerName;

        // Scanner setup
        Scanner scn = new Scanner(System.in);

        // Input for Programmer's Name
        System.out.print("Enter Programmer's Name: ");
        programmerName = scn.nextLine();

        // Input for the First Number
        System.out.print("Enter your First Number: ");
        x = scn.nextInt();

        // Input for the Second Number
        System.out.print("Enter your Second Number: ");
        y = scn.nextInt();

        // Closing the Scanner
        scn.close();

        // Calculation
        sum = x + y;

        // Output the results
        System.out.println("The Sum is: " + sum);
        System.out.println("The Programmer is: " + programmerName);
    }
}
