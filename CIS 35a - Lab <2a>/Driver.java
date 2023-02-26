// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  2a
// Due Date:           02.06.2023
// Date Submitted:     02.06.2023
// __________________________________

import java.util.Scanner;

public class Driver {
    static Scanner s1 = new Scanner(System.in);
    public static void main(String [] args) {
        // Driver object to use Person class
        Driver d1 = new Driver();

        // Create and print Person object "Stacey"
        Person Stacey = d1.readValue(s1);
        Stacey.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Create and print Person object "Ross"
        Person Ross = d1.readValue(s1);
        Ross.print();
        s1.nextLine(); // Clear input buffer
        System.out.printf("\n");

        // Create and print Person object "Mia"
        Person Mia = d1.readValue(s1);
        Mia.print();
        System.out.printf("\n");

        s1.nextLine(); // Clear input buffer

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 02.06.2023%n");
    }

    // METHODS
    public Person readValue(Scanner s1) {

        // Collect and store name:
        System.out.printf("\nEnter a name: ");
        String name = s1.nextLine();

        // Collect and store address:
        System.out.printf("Enter an address: ");
        String address = s1.nextLine();

        // Collect and store age:
        System.out.printf("Enter an age: ");
        int age = s1.nextInt();

        // Collect and store phone number:
        System.out.printf("Enter a phone number: ");
        int phoneNum = s1.nextInt();
        
        // Create and return new Person object
        return new Person(name, address, age, phoneNum);
    }
}

/* TEST RUN:

    Enter a name: Stacey
    Enter an address: 123 Main St.
    Enter an age: 20
    Enter a phone number: 1234567890
    Stacey, 123 Main St., 20, 1234567890

    Enter a name: Ross
    Enter an address: 200 De Anza Blvd.
    Enter an age: 30
    Enter a phone number: 0987654321
    Ross, 200 De Anza Blvd., 30, 987654321

    Enter a name: Mia
    Enter an address: 369 Industrial Ave.
    Enter an age: 40
    Enter a phone number: 1010101010   
    Mia, 369 Industrial Ave., 40, 1010101010

    Thank you for using my program. 
    -Neil Dandekar, 02.06.2023

 * END TEST RUN */