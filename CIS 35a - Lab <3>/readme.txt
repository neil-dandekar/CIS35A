Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  3
Due Date:           02.19.2023
Date Submitted:     02.19.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

DRIVER:
* 'Driver.java' is the Driver and contains main. Sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
keyboard input

    DESIGN:
    * Variables
        * (Driver)
            * d1 - Driver object used to call runProgram() and create Franchise object.
        * (Franchise)
            * f - Franchise object to demonstrate functionality.

    * Input
        * Calls UI instance method play() to take user input to access data about the Franchise object.

    * Processing 
        * public static void main(String[] args):
            Creates d1 Driver object and runs program.

        * public runProgram(String filename):
            Takes one String input for the name of data file. Reads data file using FileIO object and creates 
            Franchise object. Creates UI object to demonstrate Franchise/Store functionality.

    * Output
        * Outputs the user-specified operations on the Franchise object.

FILE_IO:
* 'FileIO.java' contains the FileIO object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:
    * Variables
        * (String)
            * fname - private instance variable to data file name.
        * (Boolean)    
            * DEBUG - allows for debugging.

    * Input
        * N/A

    * Processing 
        * INSTANCE METHODS:
            - public Franchise readData():
                Parses through data file to initialize then return Franchise object.
            - public int buildStore(Franchise a1, int counter, String temp):
                Takes input data and initializes then adds Store object to Franchise object.

    * Output
        * N/A

PART 2:

    GENO_NUCLEIC_ACID:
    * 'GenoNucleicAcid.java' is the Driver and contains main. Sample output is provided at the bottom.
    * Instructions: Run this file just like any other java file and answer the questions printed to console with 
    keyboard input

        DESIGN:
        * Variables
            * (GenoNucleicAcid)
                * d1 - GenoNucleicAcid object used to call readValue() and to create new NucleicAcid objects.
            * (NucleicAcid)
                * Cytosine, Adenine, Guanine, Thymine, Uracil - NucleicAcid objects to demonstrate functionality.

        * Input
            * Use a scanner to read input for NucleicAcid object info (name, formula, molar mass, density) for 
            each NucleicAcid.

        * Processing 
            * public static void main(String[] args):
                Creates d1 GenoNucleicAcid object and creates/prints 3 NucleicAcid objects.

            * public NucleicAcid readValue(Scanner s1):
                Takes one Scanner object, s1, argument. Uses the Scanner object to prompt user for input to 
                create and return a NucleicAcid object. Information collected include the name, formula, molar 
                mass, and density using the Scanner class methods.

        * Output
            * Each NucleicAcid object is printed as a string, displaying their respective properties.

FRANCHISE:
* 'Franchise.java' contains the Franchise object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:
    * Variables
        * (Store[])
            * stores - private instance array to contain the Franchise's Store objects.

    * Input
        * N/A

    * Processing 
        * GETTER METHODS: 
            - public Store getStores(int i) 
            - public int getNumberOfStores()
            Getter methods take must be called using an instance of the class. They return the  respective instance 
            variable. For example, getNumberOfStores() returns the number of Stores.

        * SETTER METHODS: 
            - public void setStores(Store stores, int i)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change. For example, setStores() takes a Store object and index and
            sets the corresponding Store object in the stores[] array.

        * INSTANCE METHODS:
            - public void calc()
            Calls analyzeResults() for each Store object in stores[].

    * Output
        * N/A

STORE:
* 'Store.java' contains the Store object blueprint (class). 
* Instructions: N/A.
    DESIGN:
    * Variables
        * private float avgSalesByWeek[];
        * private float avgWeeklySales;
        * private float salesByWeek[][];
        * private float totalSalesByWeek[];
        * private float totalSalesForAllWeeks;
        * private int weekWithHighestSales;
        * private int weekWithLowestSales;
        - These arrays or values are self explanatory. For example, salesByWeek[][] stores all sale data, indexed by 
        [WEEK][DAY]; totalSalesByWeek[] stores the total stales for each week, indexed by [WEEK]; weekWithHighestSales
        stores the index of the week with the highest sales.
    
    * Input
        * N/A
    
    * Processing 
        * GETTER METHODS: 
            - public float getTotalSalesForWeek(int week)
            Getter methods take must be called using an instance of the class. They return the respective instance 
            variable. For example, getTotalSalesForWeek() returns the total sales for a specified week.

        * SETTER METHODS: 
            - public void setSaleForWeekDayIntersection(int week, int day, float sale)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change. For example, public void setSaleForWeekDayIntersection() takes a 
            sale amount and indeces for a week/day intersection and sets the corresponding day's sale to the input.

        * INSTANCE METHODS:
            - public void printData()       
            - public void calcTotalSalesByWeek()
		    - public void calcAvgSalesByWeek()
		    - public void calcTotal()
		    - public void calcAvgWeeklySales()
		    - public void calcWeekWithHighestSales()
		    - public void calcWeekWithLowestSales()
            - public void analyzeResults()
		    - public void print(int x)
            The calculation methods calculate the values based on the data stored in salesByWeek[][] and initialize the 
            corresponding instance variables. printData() prints all the sales data for the Store object. print() will print
            one of 6 operations (each corresponding to a different instance variable) based on the input parameter, or 
            printData() or all of the above.

        * Output
            * N/A


UI:
* 'UI.java' contains the Store object blueprint (class). 
* Instructions: N/A.
    DESIGN:
    * Variables
        * (Franchise)
            * f - Franchise object to perform operations on.
    
    * Input
        * N/A
    
    * Processing
        * INSTANCE METHODS:
            - public void play()
            Creates interactive UI for user to visualize data from Franchise object. Prints instructions for user to select an 
            operation to use on the given Franchise object. Uses a Scanner object to take user input, then runs one of 8 operations:
            1. Print Total Sales by Week
            2. Print Average Sales by Week
            3. Print Total Sales
            4. Print Average Weekly Sales
            5. Print Week with Highest Sales
            6. Print Week with Lowest Sales
            7. Print Data
            8. All Above Operations


Thank you for using my program.
-Neil Dandekar, 02.19.2023