abstract class Character {
    protected String name;
    protected int health = 100;

    public Character(String name) {
        this.name = name;
    }

    public void introduce() {
        System.out.println("I am " + name + " with " + health + " health.");
    }

    public abstract int countForce();

    public abstract int countProtection();

    public void fight(Character another) {
        int myForce = this.countForce();
        int opponentForce = another.countForce();
        int myProtection = this.countProtection();
        int opponentProtection = another.countProtection();

        System.out.println(name + " is fighting " + another.name);

        if (myForce > opponentForce) {
            int damage = (myForce - opponentForce) / Math.max(1, opponentProtection);
            another.health -= damage;
            System.out.println(another.name + " takes " + damage + " damage.");
        } else if (myForce < opponentForce) {
            int damage = (opponentForce - myForce) / Math.max(1, myProtection);
            this.health -= damage;
            System.out.println(name + " takes " + damage + " damage.");
        } else {
            System.out.println("The fight is a draw! No damage taken.");
        }
    }
}
