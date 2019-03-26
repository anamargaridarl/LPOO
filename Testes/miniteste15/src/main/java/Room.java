import java.util.ArrayList;
import java.util.List;

public class Room implements Facility {

    private Building b;
    private String number;
    protected String name;
    private int floor;
    private int capacity;
    private List<User> authorized = new ArrayList<>();

    public Room(Building b, String number, int floor) throws  Exception{

        if(floor > b.getMaxFloor() || floor < b.getMinFloor())
            throw new IllegalArgumentException();
        this.b = b;
        this.number = number;
        this.name = b.getName() + number;
        this.floor = floor;
        b.addRoom(this);

    }

    public Room(Building b, String number, int floor, int capacity) throws Exception {

        if(floor < 1)
            throw new IllegalArgumentException();

        this.b = b;
        this.number = number;
        this.name = b.getName() + number;
        this.floor = floor;
        this.capacity = capacity;
        b.addRoom(this);
    }

    public Building getBuilding() {
        return b;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getFloor() {
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Room(" + b.getName() + "," + number + ")";
    }

    public void authorize(User u1) {
        authorized.add(u1);

    }

    public boolean canEnter(User u1) {

        for (User authorized : authorized) {
            if (authorized.getName() == u1.getName())
                return true;
        }

        return false;

    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Room p = (Room) o;
        return number == p.getNumber();
    }
}

