// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part2;

public class CruiseShip extends Ship {
    // PROPERTIES
    double ticketPrice;
    int numberOfRooms;
    String buffetMenu;
    String[] services;
    String cruiseType;

    // CONSTRUCTORS
    public CruiseShip() {
    }
    public CruiseShip(double ticketPrice, int numberOfRooms, String buffetMenu, String[] services, String cruiseType) {
        this.ticketPrice = ticketPrice;
        this.numberOfRooms = numberOfRooms;
        this.buffetMenu = buffetMenu;
        this.services = services;
        this.cruiseType = cruiseType;
    }
    public CruiseShip(boolean floating, double length, double width, double height, int capacity, String origin,
            String name, String departureDate, String arrivalDate, String departingPort, String arrivalPort,
            String owner, double ticketPrice, int numberOfRooms, String buffetMenu, String[] services,
            String cruiseType) {
        super(floating, length, width, height, capacity, origin, name, departureDate, arrivalDate, departingPort,
                arrivalPort, owner);
        this.ticketPrice = ticketPrice;
        this.numberOfRooms = numberOfRooms;
        this.buffetMenu = buffetMenu;
        this.services = services;
        this.cruiseType = cruiseType;
    }

    // METHODS
        // INSTANCE
    public void print() {
        super.print();
        System.out.printf("Ticket Price: $%.2f\n", ticketPrice);
        System.out.printf("Number of Rooms: %d rooms\n", numberOfRooms);
        System.out.printf("Buffet Menu: %s\n", buffetMenu);
        System.out.printf("Services: [");
        for(int i = 0; i < services.length; i++) {
            if(i != services.length - 1) System.out.printf("%s, ", services[i]);
            else System.out.printf("%s]\n", services[i]);
        }
        System.out.printf("Cruise Type: %s\n", cruiseType);
    }
        // GETTERS AND SETTERS
    public double getTicketPrice() {
        return ticketPrice;
    }
    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }
    public String getBuffetMenu() {
        return buffetMenu;
    }
    public void setBuffetMenu(String buffetMenu) {
        this.buffetMenu = buffetMenu;
    }
    public String[] getServices() {
        return services;
    }
    public void setServices(String[] services) {
        this.services = services;
    }
    public String getCruiseType() {
        return cruiseType;
    }
    public void setCruiseType(String cruiseType) {
        this.cruiseType = cruiseType;
    }
}