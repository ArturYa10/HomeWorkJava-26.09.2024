class Superhero extends Character {
    private int force;
    private Weapon weapon;
    private Protection protection;

    public Superhero(String name, int force, Weapon weapon, Protection protection) {
        super(name);
        this.force = force;
        this.weapon = weapon;
        this.protection = protection;
    }

    @Override
    public int countForce() {
        return force + (weapon != null ? weapon.getForce() : 0);
    }

    @Override
    public int countProtection() {
        return protection != null ? protection.getLevel() : 1;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("Weapon: " + (weapon != null ? weapon : "None"));
        System.out.println("Protection: " + (protection != null ? protection : "None"));
    }
}
