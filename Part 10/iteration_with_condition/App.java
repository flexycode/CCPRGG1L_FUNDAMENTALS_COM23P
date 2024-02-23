public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 10; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i + " is an even number.");
            } else {
                System.out.println(i + " is an odd number.");
            }
        }
    }
}