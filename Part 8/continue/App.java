public class App {
    public static void main(String[] args) throws Exception {

        for (int i = 5; i != 0; i--) {

            if (i == 3) {
                System.out.println("Go ahead i will skip this third loop.");
                continue;
            }

            System.out.println("Jay");
        }

    }
}