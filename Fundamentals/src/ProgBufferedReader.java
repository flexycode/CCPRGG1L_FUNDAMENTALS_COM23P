package Fundamentals;
import java.io.*;

public class ProgBufferedReader {
 
    public static void main(String[] args) throws IOException {
        // BufferedReader setup
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        
        // Input for the 1st number
        System.out.print("Enter your 1st Number:");
        double x = Double.parseDouble(stdin.readLine());
        
        // Input for the 2nd number
        System.out.print("Enter your 2nd Number:");
        double y = Double.parseDouble(stdin.readLine());
        
        // Calculations
        double sum = x + y;
        double quo = x / y;
        
        // Output the results
        System.out.println("The Sum is: " + sum);
        System.out.println("The Quotient is: " + quo);
    }
}
