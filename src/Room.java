public class Room implements CloneableGameEntity {
    private String name;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new Room(this.name);
    }
}
