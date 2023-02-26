// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  -1
// Due Date:           01.18.2023
// Date Submitted:     01.14.2023
// __________________________________

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        // Variables for product quantities:
        int numTVs  = 0;
        int numVCRs = 0;
        int numRCs  = 0;
        int numCDPs = 0;
        int numTRs  = 0;

        // Price and tax constants:
        final double TV_PRICE  = 400.00;
        final double VCR_PRICE = 220.00;
        final double RC_PRICE  = 35.20;
        final double CDP_PRICE = 300.00;
        final double TR_PRICE  = 150.00;
        final double TAX_RATE  = 0.0825;

        // Creating Scanner object for I/O:
        Scanner in = new Scanner(System.in);
        
        // Running program twice:
        for(int i = 0; i < 2; i++) {
            // Prompting user for quantities:
            System.out.printf("%nROUND #%d:%n", i + 1);
            System.out.printf("How many TV's were sold? "); 
            numTVs = in.nextInt();

            System.out.printf("How many VCR's were sold? ");
            numVCRs = in.nextInt();

            System.out.printf("How many Remote Controllers were sold? "); 
            numRCs = in.nextInt();

            System.out.printf("How many CD's were sold? "); 
            numCDPs = in.nextInt();

            System.out.printf("How many Tape Recorders were sold? "); 
            numTRs = in.nextInt();

            // Displaying the biil with calculations:
            System.out.printf("%nThank you, here is your bill: %n%n");
            System.out.printf("%-5s %-15s %-10s   %-10s %n","QTY", "DESCRIPTION", "UNIT PRICE", "TOTAL PRICE");
            System.out.printf("%-5d %-15s $%-9.2f   $%-10.2f %n", numTVs,  "TV",              TV_PRICE,  numTVs  * TV_PRICE);
            System.out.printf("%-5d %-15s $%-9.2f   $%-10.2f %n", numVCRs, "VCR",             VCR_PRICE, numVCRs * VCR_PRICE);
            System.out.printf("%-5d %-15s $%-9.2f   $%-10.2f %n", numRCs,  "Remote Control",  RC_PRICE,  numRCs  * RC_PRICE);
            System.out.printf("%-5d %-15s $%-9.2f   $%-10.2f %n", numCDPs, "CD Player",       CDP_PRICE, numCDPs * CDP_PRICE);
            System.out.printf("%-5d %-15s $%-9.2f   $%-10.2f %n", numTRs,  "Tape Recorder",   TR_PRICE,  numTRs  * TR_PRICE);
            System.out.printf("%n");
            
            // Displaying the bills with calculations:
            double subtotal = (numTVs * TV_PRICE) + (numVCRs * VCR_PRICE) + (numRCs * RC_PRICE) + (numCDPs * CDP_PRICE) + (numTRs * TR_PRICE);
            double tax      = subtotal * TAX_RATE;
            double total    = subtotal + tax;
            System.out.printf("%8s TOTALS%n", "");
            System.out.printf("%8s $%-10.2f %n", "SUBTOTAL", subtotal);
            System.out.printf("%8s $%-10.2f %n", "TAX",      tax);
            System.out.printf("%8s $%-10.2f %n", "TOTAL",    total);
        }

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 01.14.2023%n");
        
        // Close Scanner to prevent leaks
        in.close();
    }
}