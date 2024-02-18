public class App {
    public static void main(String[] args) {

        // Character Class
        Character champion = new Character();

        champion.attackdamage = 150;
        champion.armor = 100;
        champion.abilitypower = 0;
        champion.name = "Garen";
        champion.sayMyName();

        Enemy minions = new Enemy();

        minions.damage = 40;
        minions.health = 900;
        minions.armor = 50;
        minions.hasMagicImmunity = false;
        minions.name = "Siege Minions";
        minions.enemyDialogue();

        // Create a Pet Class

        // Properties
        // name
        // trust level
        // isAdopted
        // Birthday

        // Create one object
        // object - dog

        // name - Browny
        // trust level - 100
        // isAdopted - false
        // Birthday - 04/03/1990

        Pet cat = new Pet();
        cat.name = "Potchi";
        cat.trustlevel = 100;
        cat.isAdopted = false;
        cat.birthday = "11/03/2021";

        // Create a Person Class

        // Properties

        // object - Me
        // firstname
        // middlename
        // surname
        // age

        // object - me
        // firstname - Flexy
        // middlename - P
        // surname - talosig
        // age - 20

        Person Me = new Person();
        Me.firstname = "flexy";
        Me.middlename = 'J';
        Me.surname = "javascript";
        Me.age = 20;

        // Create a fruit class

        // properties
        // color
        // taste
        // weight
        // isMyfavorite
        // firstLetterofFruitObject

        // example:

        // object - Avocado
        Fruit Avocado = new Fruit();

        // color - Yellow
        Avocado.color = "Green";
        // taste - supersweet
        Avocado.taste = "sweet";
        // weight - 0.25
        Avocado.weight = 0.20f;
        // isMyfavorite - true
        Avocado.isMyfavorite = true;
        // firstLetterofFruitObject - M
        Avocado.firstLetterofFruitObject = 'A';

    }
}