Name:               Neil Dandekar
Class [Section]:    CIS 35A [36Y]
Assignment Number:  4
Due Date:           02.27.2023
Date Submitted:     02.27.2023
__________________________________

Hello.

** All code is formatted so that it is easy to read with comments documenting the functionality.

DRIVER_1:
* 'Driver1.java' is the Driver and contains main. Sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
keyboard input

    DESIGN:
    * Variables
        * (SavingsAccount)
            * saver1, saver2 - SavingsAccount objects to demonstrate functionality.

    * Input
        * N/A

    * Processing 
        * This file calls various methods on the SavingsAccount objects to demonstrate functionality. For example,
        money is withdrawn and deposited, and variations of annual interest rates are applied to the objects.
    
    * Output
        * Prints the output of each of the instance methods of the SavingsAccount objects. In particular, the 
        savings balance is printed to console.

DRIVER_2:
* 'Driver2.java' is the Driver and contains main. Sample output is provided at the bottom.
* Instructions: Run this file just like any other java file and answer the questions printed to console with 
keyboard input

    DESIGN:
    * Variables
        * (SavingsAccount)
            * saver1, saver2 - SavingsAccount objects to demonstrate functionality.

    * Input
        * N/A

    * Processing 
        * This file calls various methods on the SavingsAccount objects to demonstrate functionality. For example,
        money is withdrawn and deposited, and variations of annual interest rates are applied to the objects.
    
    * Output
        * Prints the output of each of the instance methods of the SavingsAccount objects. In particular, the 
        savings balance is printed to console.

SAVINGS_ACCOUNT:
* 'SavingsAccount.java' contains the SavingsAccount object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:
    * Variables
        * (double)
            * annualInterestRate - private static instance variable to represent class annual interest rate.
            * savingsBalance - private instance variable to represent individual object savings balance.

    * Input
        * N/A

    * Processing 
        * GETTER METHODS: 
            - protected double getSavingsBalance()
            Getter methods take no input but must be called using an instance of the class. They return the 
            respective instance variable.

        * SETTER METHODS: 
            - protected void setSavingsBalance(double amount)
            - public static void modifyInterestRate(double newAIR)
            Setter methods must be called using an instance of the class. They take an input corresponding to
            the instance variable they will change.

        * INSTANCE METHODS:
            - public void calculateMonthlyInterest()
            Calculates the monthly interest with this formula: Savings balance = Savings Balance + 
            Savings Balance * AIR/12.
            - public void withdrawSavings(double amount)
            Withdraws a specified amount from the savings balance.
            - public void depositSavings(double amount)
            Deposits a specified amount to the savings balance.

    * Output
        * N/A

SPECIAL_SAVINGS:
* 'SpecialSavings.java' contains the SpecialSavings object blueprint (class). 
* Instructions: N/A.
    
    DESIGN:
    * Variables
        * (double)
            * savingsBalance - local variable to represent the current savings balance.

    * Input
        * N/A

    * Processing 
        * INSTANCE METHODS:
            - public void calculateMonthlyInterest() {
            Overrides and calls the SavingsAccount calculateMonthlyInterest() if the savings balance is less 
            than 10000. Otherwise it calculates the monthly interest with this formula: Savings balance = 
            Savings Balance + Savings Balance * 0.1/12.

    * Output
        * N/A

Thank you for using my program.
-Neil Dandekar, 02.27.2023