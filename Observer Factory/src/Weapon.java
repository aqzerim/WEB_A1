public class Weapon implements GameItem {
    private final String name;

    public Weapon(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
