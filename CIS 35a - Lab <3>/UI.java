// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  3
// Due Date:           02.19.2023
// Date Submitted:     02.19.2023
// __________________________________

import java.util.Scanner;

public class UI {
    // PROPERTIES
    Franchise f;

    // CONSTRUCTOR(S)
    UI(Franchise f) {
        this.f = f;
    }

    // METHOD(S)
    public void play() {
        // Scanner object:
        Scanner scan = new Scanner(System.in);

        // Print Insrtuctions:
        System.out.printf(
              "Hello, welcome to Lab 3 by Neil Dandekar.\n\n"
            + "The program will prompt you to select a store # (1-6).\n"
            + "Then, select an operation from the list below:\n"
                +   "\t1. Print Total Sales by Week\n"
                +   "\t2. Print Average Sales by Week\n"
                +   "\t3. Print Total Sales\n"
                +   "\t4. Print Average Weekly Sales\n"
                +   "\t5. Print Week with Highest Sales\n"
                +   "\t6. Print Week with Lowest Sales\n"
                +   "\t7. Print Data\n"
                +   "\t8. All Above Operations\n"
            + "To end the program, enter \'quit\'. Enjoy.\n\n");
        
        // Loop until user enters 'quit':
        while(true) {
            // Prompt user for store # and read input:
            System.out.printf("Select a Store: ");
            String quit = scan.nextLine();

            // Stop program if user entered 'quit', otherwise save store #:
            if(quit.equals("quit")) break;
            int store = Integer.parseInt(quit);

            // Prompt user for operation # and store input:
            System.out.printf("Select an Operation: ");
            int operation = scan.nextInt();

            // Print appropriate operation on appropriate store:
            System.out.println();
            f.getStores(store-1).print(operation);
            System.out.println();

            // Reset input buffer:
            scan.nextLine();

            System.out.printf("\n");
        }
        // Close Scanner to prevent resource leak:
        scan.close();

        // Thank you statement:
        System.out.printf("\nThank you for using my program. \n-Neil Dandekar, 02.19.2023\n");
    }
}