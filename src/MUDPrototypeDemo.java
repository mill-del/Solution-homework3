public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Magic Chamber");


        Room clonedRoom1 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom2 = (Room) prototypeRoom.cloneEntity();
        Room clonedRoom3 = (Room) prototypeRoom.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom.getName());
        System.out.println("Cloned Room 1: " + clonedRoom1.getName());
        System.out.println("Cloned Room 2: " + clonedRoom2.getName());
        System.out.println("Cloned Room 3: " + clonedRoom3.getName());
    }
}
