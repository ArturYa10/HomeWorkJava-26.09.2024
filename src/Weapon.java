class Weapon {
    private String name;
    private int force;

    public Weapon(String name, int force) {
        this.name = name;
        this.force = force;
    }

    public int getForce() {
        return force;
    }

    @Override
    public String toString() {
        return name + " (+" + force + " force)";
    }
}
