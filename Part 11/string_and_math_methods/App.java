public class App {
    public static void main(String[] args) throws Exception {

        String name = "Jay Arre Talosig";

        // String Methods
        // charAt();
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(5));

        // concat();
        String newName = name.concat(" Mr.");
        System.out.println(newName);

        // contains()
        if (name.contains("Talosig")) {
            System.out.println(true);
        }

        // contentEquals()
        if (name.contentEquals("Jay Arre Talosig")) {
            System.out.println(true);
        }

        // equals()
        String fruit = "avocado";
        String fruit2 = "AVOCADO";

        if (fruit.equals(fruit2)) {
            System.out.println(true);
        }

        // equalsIgnoreCase()
        if (fruit.equalsIgnoreCase(fruit2)) {
            System.out.println(true);
        }

        // indexOf()
        String myName = "Kento Yamazaki";
        System.out.println(myName.indexOf("Yamazaki"));

        // isEmpty()
        String var = "";
        if (var.isEmpty()) {
            System.out.println("is empty");
        }

        // split()
        String drink = "Avocado Shake";
        String[] drinkArray = drink.split(" ");

        System.out.println(drinkArray[0]);
        System.out.println(drinkArray[1]);

        // substring()
        String mydrink = "Pineapple Juice";
        System.out.println(mydrink.substring(6));

        // trim()
        String food = "  i love bulalo.  ";
        System.out.println(food.trim());


        // Math methods
        // abs()
        int x = -7;
        double y = 5.5;
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(y));

        // ceil()
        y = 8.7;
        System.out.println(Math.ceil(y));

        // floor();
        y = 8.7;
        System.out.println(Math.floor(y));

        // max();
        int a = 4;
        int b = 5;

        System.out.println("The largest number is: " + Math.max(a,b));

        // min();
        System.out.println("The smallest number is: " + Math.min(a,b));

        // random()
        System.out.println("A random number: " + Math.random());

        // sqrt()
        System.out.println("Square root 9 is: " + Math.sqrt(9.0));

        // pow()
        System.out.println("2 power of 2 is: " + Math.pow(2,2));
    }
}