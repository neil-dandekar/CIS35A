// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  1
// Due Date:           01.25.2023
// Date Submitted:     01.25.2023
// __________________________________

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        // Get user input and start program:
        getNum();

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 01.25.2023%n");
    }

    // getNum() gets a positive integer from the user, using conditionals and a while loop to ensure
    // that the input is valid. Then, it calls sqrt(), feeds the input from the user, and reports 
    // the square root approximation.
    public static void getNum() {

        Scanner in = new Scanner(System.in); // Scanner object to read input
        int num = 0; // Stores number to be square rooted
        boolean isInvalid; // Sentinel condition, represents if input is valid

        // Loop for 5 test runs:
        for(int i = 0; i < 5; i++) {
            isInvalid = true;
            // Loop to collect input until input is valid:
            while(isInvalid) {
                System.out.printf("\nTest %d: ", i+1); // Read and store input for num
                num = in.nextInt();

                // If input is invalid, print error and loop again:
                // (Valid input means num is greater than 0)
                if(num < 0) System.out.printf("ERROR: Please enter a positive integer.\n");
                // Otherwise, end the loop and call print payment info if input is valid:
                else {
                    isInvalid = false;
                }
            }
            System.out.printf("The square root of %d is %.10f.\n", num, sqrt(num));
        }

        in.close(); // Close Scanner object
    }

    // sqrt() approximates the value of an integer using the Babylon approximation and returns it.
    public static double sqrt(int num) {
        // Babylon approximation algorithm:
        double x = num;
        while(x - (num/x) > 0.0001) {
            x = (x + num / x) / 2;
        }
        return x;
    }
}

/* TEST RUN:

    Test 1: 16
    The square root of 16 is 4.0000006367.

    Test 2: 4
    The square root of 4 is 2.0000000929.

    Test 3: -2
    ERROR: Please enter a positive integer.

    Test 3: 79
    The square root of 79 is 8.8882037267.

    Test 4: 256
    The square root of 256 is 16.0000035267.

    Test 5: -100
    ERROR: Please enter a positive integer.

    Test 5: 0
    The square root of 0 is 0.0000000000.

    Thank you for using my program. 
    -Neil Dandekar, 01.25.2023

 * END TEST RUN */