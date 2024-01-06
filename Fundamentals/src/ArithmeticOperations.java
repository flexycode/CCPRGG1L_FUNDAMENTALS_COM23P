class HelloWorld {
    public static void main(String[] args) {
        // Variable Declarations and Initialization
        int sum, diff, prod, quo, mod, num1 = 20, num2 = 40;

        // Performing Arithmetic Operations
        sum = num1 + num2;
        diff = num1 - num2;
        prod = num1 * num2;
        quo = num2 / num1;
        mod = num2 % num1;

        // Printing the Results
        System.out.println("The Sum is: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("The Difference is: " + num1 + " - " + num2 + " = " + diff);
        System.out.println("The Product is: " + num1 + " * " + num2 + " = " + prod);
        System.out.println("The Quotient is: " + num2 + " / " + num1 + " = " + quo);
        System.out.println("The Modulus is: " + num2 + " % " + num1 + " = " + mod);
    }
}
