public class App {
    public static void main(String[] args) {

        // Creates a new object named "Knight" from Character class
        Character knight = new Character(10, 5, 0, "Garen");
        // Calls the sayMyName method
        knight.sayMyName();

        // Creates a new object named "mage" from Character class
        Character mage = new Character(0, 5, 10, "Ahri");
        // Calls the sayMyName method
        mage.sayMyName();

        // Creates a new object named "mage" from Character class
        Character assassin = new Character(5, 10, 0, "Akali");
        // Calls the sayMyName method
        assassin.sayMyName();
    }
}