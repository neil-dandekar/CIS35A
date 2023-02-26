// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  -1
// Due Date:           01.18.2023
// Date Submitted:     01.14.2023
// __________________________________

import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {
        // Creating Scanner object for I/O:
        Scanner in = new Scanner(System.in);

        // Looping program 5 times:
        for(int i = 0; i < 5; i ++) {

            // Prompting user for input Celsius temperature
            System.out.printf("\nEnter a temperature in Celsius: ");

            // Reading Celsius input:
            double tempC = in.nextDouble();

            // Converting to Fahrenheit: 
            double tempF = 32 + tempC * (9.0/5.0);

            // Displaying new temperature conversion:
            System.out.printf("%.2f degrees Celsius is equivalent to %.2f degrees Fahrenheit.\n", tempC, tempF);

            // Blank line for formatting purposes
            System.out.printf("");

            // Prompting user for input Fahrenheit temperature
            System.out.printf("\nEnter a temperature in Fahrenheit: ");

            // Reading Fahrenheit input:
            tempF = in.nextDouble();

            // Converting to Fahrenheit: 
            tempC = (tempF - 32) * (5.0/9.0);

            // Displaying new temperature conversion:
            System.out.printf("%.2f degrees Fahrenheit is equivalent to %.2f degrees Celsius.\n", tempF, tempC);
        }

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 01.14.2023%n");
        
        // Close Scanner to prevent leaks
        in.close();
    }
}
