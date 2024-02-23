public class App {
    public static void main(String[] args) throws Exception {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number.");
            } else {
                System.out.println(number + " is an odd number.");
            }
        }
    }
}