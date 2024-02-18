public class App {
    public static void main(String[] args) {

        // Character Class
        Character fighter = new Character(10, 5, 0, "Jarvan");
        knight.sayMyName();

        Character mage = new Character(0, 5, 10, "Lux");
        mage.sayMyName();

        Character jungle = new Character(5, 10, 0, "LeeSin");
        thief.sayMyName();

        // Enemy Class
        Enemy boss = new Enemy(50, 500, 100, true, "Baron Nashor");
        boss.enemyDialogue();

        Enemy minions = new Enemy(5, 10, 5, false, "Caster Minion");
        skeleton.enemyDialogue();

        Enemy dragon = new Enemy(40, 400, 75, false, "Hextech Drake");
        dragon.enemyDialogue();
    }
}