import java.util.Scanner;

public class GroceryList {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Grocery List App!");

        int numItems = getNumberOfItems();

        String[] items = new String[numItems];
        double[] prices = new double[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.println("Enter details for Item " + (i + 1) + ":");
            System.out.print("Name: ");
            items[i] = scan.nextLine();
            System.out.print("Price: ");
            prices[i] = scan.nextDouble();
            scan.nextLine(); // Consume the newline character
        }

        System.out.println("Your Grocery List:");
        for (int i = 0; i < numItems; i++) {
            System.out.println("Item " + (i + 1) + ": " + items[i] + " - $" + prices[i]);
        }

        double total = calculateTotal(prices);
        System.out.println("Total: $" + total);

        scan.close();
    }

    static int getNumberOfItems() {
        System.out.print("Enter the number of items in your grocery list: ");
        int numItems = scan.nextInt();
        scan.nextLine(); // Consume the newline character
        return numItems;
    }

    static double calculateTotal(double[] prices) {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}