// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part2;

public class Ship {
    // PROPERTIES
    private boolean floating;
    private double  length;
    private double  width;
    private double  height;
    private int     capacity;
    private String  name;
    private String  origin;
    private String  departureDate;
    private String  arrivalDate;
    private String  departingPort;
    private String  arrivalPort;
    private String  owner;

    // CONSTRUCTORS
    public Ship() {
    }

    public Ship(boolean floating, double length, double width, double height, int capacity, String origin,
            String name, String departureDate, String arrivalDate, String departingPort, String arrivalPort, 
            String owner) {
        this.floating = floating;
        this.length = length;
        this.width = width;
        this.height = height;
        this.capacity = capacity;
        this.origin = origin;
        this.name = name;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departingPort = departingPort;
        this.arrivalPort = arrivalPort;
        this.owner = owner;
    }
    // METHODS
        // INSTANCE
    public void print() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Owner: %s\n", owner);
        System.out.printf("Floating: %B\n", floating);
        System.out.printf("Length: %.2f feet\n", length);
        System.out.printf("Width: %.2f feet\n", width);
        System.out.printf("Height: %.2f feet\n", height);
        System.out.printf("Capacity: %d people\n", capacity);
        System.out.printf("Origin: %s\n", origin);
        System.out.printf("Departure Date: %s\n", departureDate);
        System.out.printf("Arrival Date: %s\n", arrivalDate);
        System.out.printf("Departing Port: %s\n", departingPort);
        System.out.printf("Arrival Port: %s\n", arrivalPort);
    }

        // GETTERS AND SETTERS
    public boolean isFloating() {
        return floating;
    }

    public void setFloating(boolean floating) {
        this.floating = floating;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDepartingPort() {
        return departingPort;
    }

    public void setDepartingPort(String departingPort) {
        this.departingPort = departingPort;
    }

    public String getArrivalPort() {
        return arrivalPort;
    }

    public void setArrivalPort(String arrivalPort) {
        this.arrivalPort = arrivalPort;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}