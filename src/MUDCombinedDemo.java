public class MUDCombinedDemo {
    public static void main(String[] args) {

        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Ancient Ruins")
                .addRoom(new Room("Hall"))
                .addNPC(new NPC("Dragon Lord"))
                .build();

        System.out.println("Original Dungeon:");
        dungeon.showInfo();


        Room prototypeRoom = new Room("Treasure Chamber");

        Room clonedRoom1 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom2 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom3 = (Room) prototypeRoom.cloneEntity();

        System.out.println("\nAdding Cloned Rooms:");
        System.out.println(clonedRoom1.getName());
        System.out.println(clonedRoom2.getName());
        System.out.println(clonedRoom3.getName());
    }
}
