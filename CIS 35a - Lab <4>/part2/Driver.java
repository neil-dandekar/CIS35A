// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part2;

public class Driver {
    public static void main(String[] args) {
        // Declare and Initialize Ship objects:
        Ship s1 = new Ship(
            true,
            1000,
            100,
            100,
            500,
            "San Francisco",
            "Ship",
            "01/01/2023",
            "03/01/2023",
            "Los Angeles",
            "Mexico City",
            "John Johnson"
        );

        CargoShip s2 = new CargoShip(
            true,
            2000,
            200,
            200,
            1000,
            "Los Angeles",
            "Cargo Ship",
            "02/02/2023",
            "05/05/2023",
            "Los Angeles",
            "San Francisco",
            "Jonny Appleseed",
            true,
            10,
            100000000,
            "Drugs - Cocaine, Methamphetamine, Heroin",
            "Cranes"
        );

        String[] services = {"Dancing, Music, Massage, Game Night, Movie Night"};
        CruiseShip s3 = new CruiseShip(
            true,
            1500,
            150,
            150,
            3000,
            "Mexico City",
            "Cruise Ship",
            "07/07/2023",
            "08/08/2023",
            "San Francisco",
            "Los Angeles",
            "Jerry Barry",
            99.99,
            1000,
            "Eggs, Chicken, Salad, Water",
            services,
            "Disney World"
        );

        // Create array of Ship object:
        Ship[] ships = {s1, s2, s3};

        // Loop through array and print out each ship object:
        for(Ship ship : ships) {
            ship.print();
            System.out.printf("\n");
        }

        // Thank you statement:
        System.out.printf("Thank you for using my program. \n-Neil Dandekar, 02.27.2023\n"); 
    }
}


/* TEST RUN

    Name: Ship
    Owner: John Johnson
    Floating: TRUE
    Length: 1000.00 feet
    Width: 100.00 feet
    Height: 100.00 feet
    Capacity: 500 people
    Origin: San Francisco
    Departure Date: 01/01/2023
    Arrival Date: 03/01/2023
    Departing Port: Los Angeles
    Arrival Port: Mexico City

    Name: Cargo Ship
    Owner: Jonny Appleseed
    Floating: TRUE
    Length: 2000.00 feet
    Width: 200.00 feet
    Height: 200.00 feet
    Capacity: 1000 people
    Origin: Los Angeles
    Departure Date: 02/02/2023
    Arrival Date: 05/05/2023
    Departing Port: Los Angeles
    Arrival Port: San Francisco
    Contraband: TRUE
    Number of Cranes: 10 cranes
    Cargo Value: 100000000
    Cargo Type: Drugs - Cocaine, Methamphetamine, Heroin
    Loading Method: Cranes

    Name: Cruise Ship
    Owner: Jerry Barry
    Floating: TRUE
    Length: 1500.00 feet
    Width: 150.00 feet
    Height: 150.00 feet
    Capacity: 3000 people
    Origin: Mexico City
    Departure Date: 07/07/2023
    Arrival Date: 08/08/2023
    Departing Port: San Francisco
    Arrival Port: Los Angeles
    Ticket Price: $99.99
    Number of Rooms: 1000 rooms
    Buffet Menu: Eggs, Chicken, Salad, Water
    Services: [Dancing, Music, Massage, Game Night, Movie Night]
    Cruise Type: Disney World

    Thank you for using my program. 
    -Neil Dandekar, 02.27.2023

END TEST RUN */