import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        orderBurger();
    }

    static void orderBurger() {
        System.out.println("Welcome to Burger Flexy!");

        System.out.println("Enter 'A' if you want a Classic Cheeseburger!");
        System.out.println("Enter 'B' if you want a BBQ Bacon Burger!");

        System.out.print("Enter your choice: ");
        char choice = scan.next().charAt(0);

        String burger = "";
        double price = 0;

        switch (choice) {
            case 'A':
                burger = "Classic Cheeseburger";
                price = 199.00;
                break;
            case 'B':
                burger = "BBQ Bacon Burger";
                price = 229.00;
                break;
            default:
                System.out.println("Please enter 'A' or 'B'!");
                return;
        }

        System.out.println("Your order is: " + burger);
        System.out.println("Your total order amount is: " + price);

        System.out.println("Enter 'COD' if you want cash on delivery!");
        System.out.println("Enter 'CREDIT' if you want to use a credit card!");

        System.out.print("Enter your choice: ");
        String paymentMethod = scan.next();

        switch (paymentMethod) {
            case "COD":
                System.out.println("Please prepare exact amount upon delivery");
                break;
            case "CREDIT":
                System.out.print("Enter credit card number: ");
                long cardNumber = scan.nextLong();
                break;
            default:
                System.out.println("Please choose 'COD' or 'CREDIT'!");
                return;
        }

        System.out.println("Do you want to add fries to your order? (true or false)");
        System.out.print("Please enter true or false: ");
        boolean addFries = scan.nextBoolean();

        if (addFries) {
            System.out.println("Enjoy your burger with a side of fries!");
        } else {
            System.out.println("Just the burger? That's fine too!");
        }

        System.out.println("Choose your preferred pick-up time:");
        System.out.print("Enter the time (e.g. 12:30 PM): ");
        String pickUpTime = scan.next();

        System.out.println("Your order will be ready for pick-up at " + pickUpTime);

        scan.close();
    }
}
