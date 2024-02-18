public class Enemy {
    // Enemy Attributes
    int damage;
    int health;
    int armor;
    boolean hasMagicImmunity;
    String name;

    // Enemy method
    public void enemyDialogue() {
        System.out.println("Prepare yourself, Champion! for I am " + name + ", and my attacks deliver " + damage + " points of devastation!");
    }

    // Constructor
    public Enemy(int enemyDamage, int enemyHealth, int enemyArmor, boolean enemyImmunity, String enemyName) {
        damage = enemyDamage;
        health = enemyHealth;
        armor = enemyArmor;
        hasMagicImmunity = enemyImmunity;
        name = enemyName;
    }
}
