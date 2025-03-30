package Assignment2;

public class MUDPrototypeDemo {
    public static void main(String[] args) {
        Room prototype = new Room();
        prototype.name = "Ancient Chamber";
        prototype.description = "A room filled with mysterious ancient artifacts.";
        prototype.roomType = "Ancient";

        Room clone1 = (Room) prototype.cloneEntity();
        Room clone2 = (Room) prototype.cloneEntity();


        clone2.name = "Modern Chamber";
        clone2.roomType = "Modern";

        System.out.println("Prototype: " + prototype);
        System.out.println("Clone 1: " + clone1);
        System.out.println("Clone 2: " + clone2);
    }
}