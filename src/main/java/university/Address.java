package university;

public class Address {
    public Address(String street, String city, int zipCode, String state, int buildingNumber) {
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.state = state;
        this.buildingNumber = buildingNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getState() {
        return state;
    }

    public int getBuildingNumber() {
        return buildingNumber;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setBuildingNumber(int buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    private String street;
    private String city;
    private int zipCode;
    private String state;
    private int buildingNumber;
}
