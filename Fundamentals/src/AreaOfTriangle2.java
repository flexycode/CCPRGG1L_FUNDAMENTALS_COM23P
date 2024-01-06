import java.util.Scanner;

class Area0fTriangle {
    public static void main(String[] args) {
        // Scanner setup
        Scanner scanner = new Scanner(System.in);

        // Variables
        float base, height, area;

        // Input for the base
        System.out.print("Enter base: ");
        base = scanner.nextFloat();

        // Input for the height
        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        // Closing the Scanner
        scanner.close();

        // Calculation of area
        area = (base * height) / 2;

        // Output the result
        System.out.println("Area of Triangle is: " + area);
    }
}
