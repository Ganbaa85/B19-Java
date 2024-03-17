package ClassesAndObject;

public class Hotel {
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getTotalNumberOfRooms() {
        return totalNumberOfRooms;
    }
    private String address;
    private int totalNumberOfRooms;
    private String name;

    public Hotel(String name, String address, int totalNumberOfRooms) {
        this.name = name;
        this.address = address;
        this.totalNumberOfRooms = totalNumberOfRooms;
    }




}
