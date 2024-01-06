import java.util.Scanner;

class Prog2IO {
    public static void main(String[] args) {
        
        // Variable Declarations
        int x, y, sum;

        // Scanner setup
        Scanner scn = new Scanner(System.in);

        // Statement: Input for the First Name
        System.out.print("Enter your First Number: ");
        x = scn.nextInt();

        // Statement: Input for the Second Number
        System.out.print("Enter your Second Number: ");
        y = scn.nextInt();
        
        // Statement: Closing the Scanner
        scn.close();

        // Statement: Calculation
        sum = x + y;

        // Statement: Output the result
        System.out.println("The Sum is: " + sum);
    }
}
