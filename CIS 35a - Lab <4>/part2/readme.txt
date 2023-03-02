Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  4
Due Date:           02.27.2023
Date Submitted:     02.27.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

DRIVER:
* 'Driver.java' is the Driver and contains main. Sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
keyboard input
    
    DESIGN:
    * Variables
        * (Ship)
            * s1, s2, s3 - Ship objects to demonstrate functionality. In particular, they are Ship, CargoShip,
            and CruiseShip types, respectively.
        * (Ship[])
            * ships - Ship object array to store Ship objects and use them all at once.
        * (String[])
            * services - Temporary array to store the services that the CruiseShip, s3, has and is used in 
            initialization.

    * Input
        * N/A

    * Processing 
        * This file declares and initializes one Ship object, one CargoShip, and one CruiseShip then puts them
        into an array. Finally, it loops through the array and calls the print method on all of them.

    * Output
        * Each Ship object's data is printed to console.

SHIP:
* 'Ship.java' contains the Ship object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:

    * Variables
        * (boolean)
            * floating - private instance variable to represent if the Ship is floating.
        * (double)
            * length, width, height - private instance variables to represent the dimensions of the Ship.
        * (int)
            * capacity - private instance variables to represent the capacity of the Ship.
        * (String)
            * name - private instance variables to represent the name of the Ship.
            * origin - private instance variables to represent the origin of the Ship.;
            * departureDate - private instance variables to represent the departure date of the Ship.;
            * arrivalDate - private instance variables to represent the arrival date of the Ship.;
            * departingPort - private instance variables to represent the departing port of the Ship.;
            * arrivalPort - private instance variables to represent the arrival port of the Ship.;
            * owner - private instance variables to represent the owner of the Ship.;

    * Input
        * N/A

    * Processing 
        * GETTER METHODS: 
            - public boolean isFloating()
            - public double  getLength()
            - public double  getWidth()
            - public double  getHeight()
            - public int     getCapacity()
            - public String  getName()
            - public String  getOrigin()
            - public String  getDepartureDate()
            - public String  getArrivalDate()
            - public String  getDepartingPort()
            - public String  getArrivalPort()
            - public String  getOwner()
            Getter methods take no input but must be called using an instance of the class. They return the 
            respective instance variable.

        * SETTER METHODS: 
            - public void setFloating(boolean floating)
            - public void setLength(double length)
            - public void setWidth(double width)
            - public void setHeight(double height)
            - public void setCapacity(int capacity)
            - public void setName(String name)
            - public void setOrigin(String origin)
            - public void setDepartureDate(String departureDate)
            - public void setArrivalDate(String arrivalDate)
            - public void setDepartingPort(String departingPort)
            - public void setArrivalPort(String arrivalPort)
            - public void setOwner(String owner)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change.

        * INSTANCE METHODS:
            - public void print()
            Prints the object as a String. 
            Format: 
                Name: [NAME]
                Owner: [OWNER]
                Floating: [FLOATING]
                Length: [LENGTH] feet
                Width: [WIDTH] feet
                Height: [HEIGHT] feet
                Capacity: [CAPACITY] people
                Origin: [ORIGIN]
                Departure Date: [MM/DD/YYYY]
                Arrival Date: [MM/DD/YYYY]
                Departing Port: [DEPARTING PORT]
                Arrival Port: [ARRIBAL PORT]

    * Output
        * N/A

CARGO_SHIP:
* 'CargoShip.java' contains the CargoShip object blueprint (class). 
* Instructions: N/A.

    DESIGN:
    * Variables
        * (boolean)
            * contraband - private instance variable to represent if the CargoShip is a contraband.
        * (int)
            * numberofcranes - private instance variables to represent the number of cranes of the Cargo Ship.
            * cargoValue - private instance variables to represent the cargo value of the Cargo Ship.
        * (String)
            * cargoType - private instance variables to represent the cargo type of the Cargo Ship.
            * loadingMethod - private instance variables to represent the loading method of the Cargo Ship.

    * Input
        * N/A

    * Processing 
        * GETTER METHODS: 
            - public boolean isContraband()
            - public int     getNumberofcranes()
            - public int     getCargoValue()
            - public String  getCargoType()
            - public String  getLoadingMethod()
            Getter methods take no input but must be called using an instance of the class. They return the 
            respective instance variable.

        * SETTER METHODS:
            - public void setContraband(boolean contraband)
            - public void setNumberofcranes(int numberofcranes)
            - public void setCargoValue(int cargoValue)
            - public void setCargoType(String cargoType)
            - public void setLoadingMethod(String loadingMethod)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change.
        
        * INSTANCE METHODS:
            - public void print()
            Prints the object as a String. 
            Format: 
                Name: [NAME]
                Owner: [OWNER]
                Floating: [FLOATING]
                Length: [LENGTH] feet
                Width: [WIDTH] feet
                Height: [HEIGHT] feet
                Capacity: [CAPACITY] people
                Origin: [ORIGIN]
                Departure Date: [MM/DD/YYYY]
                Arrival Date: [MM/DD/YYYY]
                Departing Port: [DEPARTING PORT]
                Arrival Port: [ARRIBAL PORT]
                Contraband: [CONTRABAND]
                Number of Cranes: [NUMBER_OF_CRANES] cranes
                Cargo Value: [CARGO_VALUE]
                Cargo Type: [CARGO_TYPE]
                Loading Method: [LOADING_METHOD]

    * Output
        * N/A

CRUISE_SHIP:
* 'CargoShip.java' contains the CargoShip object blueprint (class). 
* Instructions: N/A.

    DESIGN:
    * Variables
        * (double)
            * ticketPrice - private instance variable to represent if the ticket price Cruise Ship.
        * (int)
            * numberOfRooms - private instance variables to represent the number of rooms of the Cruise Ship.
        * (String)
            * buffetMenu - private instance variables to represent the buffet menu of the Cruise Ship.
            * cruiseType - private instance variables to represent the cruise type of the Cruise Ship.
        * (String[])
            * services - private instance variables to represent the services of the Cruise Ship.

    * Input
        * N/A

    * Processing 
        * GETTER METHODS: 
            - public double   getTicketPrice()
            - public int      getNumberOfRooms()
            - public String   getBuffetMenu()
            - public String[] getServices()
            - public String   getCruiseType()
            Getter methods take no input but must be called using an instance of the class. They return the 
            respective instance variable.

        * SETTER METHODS:
            - public void setTicketPrice(double ticketPrice)
            - public void setNumberOfRooms(int numberOfRooms)
            - public void setBuffetMenu(String buffetMenu)
            - public void setServices(String[] services)
            - public void setCruiseType(String cruiseType)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change.
        
        * INSTANCE METHODS:
            - public void print()
            Prints the object as a String. 
            Format: 
                Name: [NAME]
                Owner: [OWNER]
                Floating: [FLOATING]
                Length: [LENGTH] feet
                Width: [WIDTH] feet
                Height: [HEIGHT] feet
                Capacity: [CAPACITY] people
                Origin: [ORIGIN]
                Departure Date: [MM/DD/YYYY]
                Arrival Date: [MM/DD/YYYY]
                Departing Port: [DEPARTING PORT]
                Arrival Port: [ARRIBAL PORT]
                Ticket Price: $[TICKET_PRICE]
                Number of Rooms: [NUMBER_OF_ROOMS] rooms
                Buffet Menu: [BUFFET_MENU]
                Services: [[SERVICES]]
                Cruise Type: [CRUISE_TYPE]

    * Output
        * N/A

Thank you for using my program.
-Neil Dandekar, 02.27.2023