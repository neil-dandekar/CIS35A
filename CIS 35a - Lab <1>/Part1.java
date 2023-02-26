// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  1
// Due Date:           01.25.2023
// Date Submitted:     01.25.2023
// __________________________________

import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        // Get user input and start program:
        getLoanInfo();

        // Thank you statement:
        System.out.printf("%nThank you for using my program. %n-Neil Dandekar, 01.25.2023%n");
    }

    // getLoanInfo() method takes 3 inputs from the user about the loan: loan amount, 
    // years to pay off the loan, and the annual interest rate. It uses conditionals 
    // and a loop to ensure the inputs are valid. Once valid inputs are entered, the
    // method calls printLoanInfo() and passes in the loan info.
    static void getLoanInfo() {
        double loan;            // Stores loan amount
        double years;           // Stores number of years to pay off loan
        double rate;            // Stores annual interest rate
        
        Scanner in = new Scanner(System.in); // Scanner object to read input
        boolean isInvalid = true; // Sentinel condition, represents if input is valid
        while(isInvalid) {        // Loop to collect input until input is valid
            System.out.printf("Loan Amount: ");
            loan = in.nextDouble();  // Collect input for loan amount
            System.out.printf("Number of years: ");
            years = in.nextDouble(); // Collect input for number of years
            System.out.printf("Annual Interest Rate: ");
            rate = in.nextDouble();  // Collect input for rate

            // If input is invalid, print error and loop again:
            // (Valid input means loan and years are greater than 0 and rate is 
            // greater than or equal to zero.)
            if(loan <= 0 || years <= 0 || rate < 0) {
                System.out.printf("ERROR: Loan amount, number of years, "
                + "and rate must be positve, Please try again.\n\n");
            }
            // Otherwise, end the loop and call print payment info if input is valid:
            else {
                isInvalid = false;
                printLoanInfo(loan, years, rate);
            }
        }

        in.close(); // Close Scanner object
    }

    // printLoanInfo() method calculates and prints the monthly payment and total 
    // payment amounts (monthly rate is also calculated, but not printed.) Then, the 
    // method calls printPayments() and passes in the calculated values as arguments.
    static void printLoanInfo(double loan, double years, double rate) {
        // Calculating and storing monthly rate (as a decimal), total payment, and 
        // monthly payment respectively:
        double m_rate = rate / 1200;         
        double tot_payment = loan * m_rate * (12 * Math.pow((1 + m_rate), 12)) 
        / (Math.pow((1 + m_rate), 12) - 1);
        double m_payment = tot_payment / 12;

        // Printing the monthly and total payments:
        System.out.printf("\nMonthly Payment: $%.2f\n", m_payment);
        System.out.printf("Total Payment: $%.2f\n", tot_payment);

        // Calling printPayments():
        printPayments(m_payment, m_rate, loan);
    }

    // printPayments() method calculates the monthly interest payments, principle, 
    // and remaining balance then prints the payments in a table format.
    static void printPayments(double m_payment, double m_rate, double loan) {
        // Printing table header:
        System.out.printf("\n%-10s %-10s %-10s %-10s\n", "Payment #", 
        "Interest", "Principle", "Balance");

        // Calculating and printing monthly interest, principle, and current balance:
        double balance = loan;                           // Current balance
        for(int i = 0; i < 12; i++) {
            double m_interest = m_rate * balance;        // Monthly interest
            double m_principle = m_payment - m_interest; // Monthly principle
            balance -= m_principle;                      // Updating balance

            // Printing the data:
            System.out.printf("%-10d $%-9.2f $%-9.2f $%-9.2f\n", i+1, 
            m_interest, m_principle, balance);
        }
    }
}

/* TEST RUN 1:

    Loan Amount: 10000
    Number of years: 1
    Annual Interest Rate: 7

    Monthly Payment: $865.27
    Total Payment: $10383.21

    Payment #  Interest   Principle  Balance   
    1          $58.33     $806.93    $9193.07  
    2          $53.63     $811.64    $8381.42  
    3          $48.89     $816.38    $7565.05  
    4          $44.13     $821.14    $6743.91  
    5          $39.34     $825.93    $5917.98  
    6          $34.52     $830.75    $5087.24  
    7          $29.68     $835.59    $4251.65  
    8          $24.80     $840.47    $3411.18  
    9          $19.90     $845.37    $2565.81  
    10         $14.97     $850.30    $1715.51  
    11         $10.01     $855.26    $860.25   
    12         $5.02      $860.25    $0.00     

    Thank you for using my program.
    -Neil Dandekar, 01.25.2023

 * END TEST RUN 1 */

/* TEST RUN 2:

    Loan Amount: -1
    Number of years: 1
    Annual Interest Rate: 7
    ERROR: Loan amount, number of years, and rate must be positve, Please try again.

    Loan Amount: 10000
    Number of years: -1
    Annual Interest Rate: 7
    ERROR: Loan amount, number of years, and rate must be positve, Please try again.

    Loan Amount: 10000
    Number of years: 1
    Annual Interest Rate: -1
    ERROR: Loan amount, number of years, and rate must be positve, Please try again.

    Loan Amount: 10000
    Number of years: 1
    Annual Interest Rate: 3.14159

    Monthly Payment: $847.58
    Total Payment: $10170.99

    Payment #  Interest   Principle  Balance   
    1          $26.18     $821.40    $9178.60  
    2          $24.03     $823.55    $8355.05  
    3          $21.87     $825.71    $7529.34  
    4          $19.71     $827.87    $6701.47  
    5          $17.54     $830.04    $5871.43  
    6          $15.37     $832.21    $5039.22  
    7          $13.19     $834.39    $4204.83  
    8          $11.01     $836.57    $3368.25  
    9          $8.82      $838.76    $2529.49  
    10         $6.62      $840.96    $1688.53  
    11         $4.42      $843.16    $845.37   
    12         $2.21      $845.37    $-0.00    

    Thank you for using my program. 
    -Neil Dandekar, 01.25.2023

 * END TEST RUN 2 */