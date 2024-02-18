public class App {
    public static void main(String[] args) {

        Character knight = new Character();

        knight.strength = 10;
        knight.agility = 5;
        knight.intelligence = 0;
        knight.name = "Garen";
        knight.sayMyName();

        Character mage = new Character();

        mage.strength = 0;
        mage.agility = 5;
        mage.intelligence = 10;
        mage.name = "Ahri";
        mage.sayMyName();

        Character assassin = new Character();

        assassin.strength = 5;
        assassin.agility = 10;
        assassin.intelligence = 0;
        mage.name = "Akali";
        assassin.sayMyName();
    }
}