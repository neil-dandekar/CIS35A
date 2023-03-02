// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part2;

public class CargoShip extends Ship {
    // PROPERTIES
    boolean contraband;
    int numberofcranes;
    int cargoValue;
    String cargoType;
    String loadingMethod;

    // CONSTRUCTORS
    public CargoShip() {
    }
    public CargoShip(boolean contraband, int numberofcranes, int cargoValue, String cargoType, String loadingMethod) {
        this.contraband = contraband;
        this.numberofcranes = numberofcranes;
        this.cargoValue = cargoValue;
        this.cargoType = cargoType;
        this.loadingMethod = loadingMethod;
    }
    public CargoShip(boolean floating, double length, double width, double height, int capacity, String origin,
            String name, String departureDate, String arrivalDate, String departingPort, String arrivalPort,
            String owner, boolean contraband, int numberofcranes, int cargoValue, String cargoType,
            String loadingMethod) {
        super(floating, length, width, height, capacity, origin, name, departureDate, arrivalDate, departingPort,
                arrivalPort, owner);
        this.contraband = contraband;
        this.numberofcranes = numberofcranes;
        this.cargoValue = cargoValue;
        this.cargoType = cargoType;
        this.loadingMethod = loadingMethod;
    }

    // METHODS
        // INSTANCE
    public void print() {
        super.print();
        System.out.printf("Contraband: %B\n", contraband);
        System.out.printf("Number of Cranes: %d cranes\n", numberofcranes);
        System.out.printf("Cargo Value: %d\n", cargoValue);
        System.out.printf("Cargo Type: %s\n", cargoType);
        System.out.printf("Loading Method: %s\n", loadingMethod);
    }
        // GETTERS AND SETTERS
    public boolean isContraband() {
        return contraband;
    }
    public void setContraband(boolean contraband) {
        this.contraband = contraband;
    }
    public int getNumberofcranes() {
        return numberofcranes;
    }
    public void setNumberofcranes(int numberofcranes) {
        this.numberofcranes = numberofcranes;
    }
    public int getCargoValue() {
        return cargoValue;
    }
    public void setCargoValue(int cargoValue) {
        this.cargoValue = cargoValue;
    }
    public String getCargoType() {
        return cargoType;
    }
    public void setCargoType(String cargoType) {
        this.cargoType = cargoType;
    }
    public String getLoadingMethod() {
        return loadingMethod;
    }
    public void setLoadingMethod(String loadingMethod) {
        this.loadingMethod = loadingMethod;
    }
}