public class Room implements CloneableGameEntity {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public Room cloneEntity() {
        return new Room(name, description);
    }

    @Override
    public String toString() {
        return "Room{name='" + name + "', description='" + description + "'}";
    }
}
