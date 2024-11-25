class Protection {
    private String name;
    private int level;

    public Protection(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public String toString() {
        return name + " (level " + level + ")";
    }
}
