import java.util.ArrayList;
import java.util.List;

public class Building implements Facility{

    private String name;
    private int minFloor;
    private int maxFloor;
    private int capacity;
    private List<Room> rooms;

    public Building(String name, int minFloor, int maxFloor) throws Exception {
        this.name = name;

        if(minFloor > maxFloor)
           throw new IllegalArgumentException();

        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        this.capacity =0;
        this.rooms = new ArrayList<>();
    }

    public int getMinFloor() {
        return minFloor;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }


    public void addRoom(Room r1) throws Exception {

        for(Room rooms: rooms)
        {
            if(rooms.equals(r1))
                throw new DuplicateRoomException();
        }

        capacity = capacity + r1.getCapacity();
        rooms.add(r1);

    }


    public boolean canEnter(User u1) {

        for(Room rooms: rooms)
        {
            if(rooms.canEnter(u1))
                return true;
        }
        return false;

    }

    @Override
    public String toString()
    {
        return "Building(" + name + ")";
    }
}
