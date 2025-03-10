public class MUDBuilderDemo {
    public static void main(String[] args) {
        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Dark Cave")
                .addRoom(new Room("Entrance"))
                .addRoom(new Room("Boss Chamber"))
                .addNPC(new NPC("Goblin King"))
                .build();

        dungeon.showInfo();
    }
}
