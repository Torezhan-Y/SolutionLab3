public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototypeRoom = new Room("Treasure Chamber", "A room filled with gold and jewels.");

        Room clonedRoom1 = prototypeRoom.cloneEntity();
        Room clonedRoom2 = prototypeRoom.cloneEntity();

        System.out.println("Original Room: " + prototypeRoom);
        System.out.println("Cloned Room 1: " + clonedRoom1);
        System.out.println("Cloned Room 2: " + clonedRoom2);
    }
}