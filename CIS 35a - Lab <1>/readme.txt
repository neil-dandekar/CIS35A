Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  1
Due Date:           01.25.2023
Date Submitted:     01.25.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

PART 1:
* 'Part1.java' contains source code and the bottom of the file contains both test runs for Assignment 1, Part 1. 
* Instructions: Run the program just like any other java file and answer the questions printed to console with 
  keyboard input

    DESIGN:
    * Variables
        * (boolean)
            * isInvalid - condition in while loop to represent if input is valid (non-negative).
        * (double)
            * loan, years, rate - loan amount, number of years to pay, and annual interest rate for storing 
              user input about loan info.
            * m_rate, tot_payment, m_payment - monthly rate and total payment are used to calculate the monthly 
              payment.
            * balance, m_interest, m_principle - remaining balance, monthly interest, and monthly principle are 
              calculated and displayed to the user in the table.
        * (int)
            * i - used as counter in for loops.

	* Input
        * Use a scanner to read input for loan info - (double) loan, years, rate
        * Inform user if input is invalid (negative) and ask again until it is valid (non-negative).

	* Processing 
        * public static void main(String[] args):
            Calls getLoanInfo() and prints thank you message.

        * static void getLoanInfo(): 
            Takes no arguments from the user. Reads 3 inputs from the user about the loan: loan amount, years to 
            pay off the loan, and the annual interest rate. It uses conditionals and a loop to check if input for
            loan, years, and rate are negative. The while loop continues collecting input and informing the user
            of invalid input until all the inputs are greater than 0. Then, the method calls printLoanInfo() and 
            passes in the loan info.

        * static void printLoanInfo(double loan, double years, double rate): 
            Takes 3 arguments: loan amount, years to pay off the loan, and the annual interest rate. It calculates 
            and prints the monthly payment and total payment amounts (monthly rate is also calculated, but not 
            printed). Then, the method calls printPayments() and passes in the calculated values as arguments.

        * static void printPayments(double m_payment, double m_rate, double loan):
            Takes 3 arguments: monthly payment, monthly interest rate, and loan amount. It displays the data for 
            each payment to be made by the user in a table format. Uses a for loop where each iteration represents 
            a singular monthly payment. In each iteration, the monthly interest, principle, and remaining balance 
            are calculated and displayed in a row. The process repeats until all payments are displayed.

    * Output
        * The monthly payment and total payment are displayed to the user.
        * The monthly interest, principle, and remaining balance are displayed as a table for each payment to be 
          made by the user.

PART 2:
* 'Part2.java' contains source code and the bottom of the file contains both test runs for Assignment 1, Part 2. 
* Instructions: Run the program just like any other java file and answer the questions printed to console with 
  keyboard input
    
    DESIGN:
    * Variables
        * (boolean)
            * isInvalid - condition in while loop to represent if input is valid (non-negative).
        * (double)
            * x - stores the approximation of the square root.
        * (int)
            * i - used as counter in for loops.
            * num - user input for the number to be square rooted.

	* Input
        * Use a scanner to read input for num.
        * Inform user if input is invalid (negative) and ask again until it is valid (non-negative).

	* Processing 
        * public static void main(String[] args):
            Calls getNum() and prints thank you message.

        * public static void getNum(): 
            Takes no arguments from the user. Reads an integer input for num and uses conditionals to check if the 
            input is valid (positive). Uses a while loop to continue collecting input and informing the user of 
            invalid input until num is positive. Then, the method calls sqrt() and passes num, and finally prints
            the result.

        * public static double sqrt(int num): 
            Takes 1 argument: the integer to perform the square root approximation. It approximates the square root
            using the formula in the book and returns the value to caller.

    * Output
        * The result of the square root approximation is printed to the user.

Thank you for using my program.
-Neil Dandekar, 01.25.2023