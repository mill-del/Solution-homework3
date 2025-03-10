public class NPC implements CloneableGameEntity {
    private String name;

    public NPC(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public CloneableGameEntity cloneEntity() {
        return new NPC(this.name);
    }
}
