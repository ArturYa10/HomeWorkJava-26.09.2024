public class SuperheroBattle {
    public static void main(String[] args) {
        // Create Weapons and Protections
        Weapon sword = new Weapon("Sword", 20);
        Weapon hammer = new Weapon("Hammer", 30);

        Protection shield = new Protection("Shield", 15);
        Protection armor = new Protection("Armor", 25);

        // Create Characters
        Superhero hero1 = new Superhero("Hero One", 10, sword, shield);
        Superhero hero2 = new Superhero("Hero Two", 15, hammer, armor);

        EvilCreature monster1 = new EvilCreature("Monster One", 25, 10);
        EvilCreature monster2 = new EvilCreature("Monster Two", 30, 20);

        // Introduce Characters
        hero1.introduce();
        hero2.introduce();
        monster1.introduce();
        monster2.introduce();

        // Fights
        hero1.fight(monster1);
        hero2.fight(monster2);

        // Post-battle stats
        System.out.println("\nAfter the battle:");
        hero1.introduce();
        hero2.introduce();
        monster1.introduce();
        monster2.introduce();
    }
}
