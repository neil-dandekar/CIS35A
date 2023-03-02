// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part1;

public class SavingsAccount {
    // PROPERTIES
    private static double annualInterestRate;
    private double savingsBalance;

    // CONSTRUCTORS
    public SavingsAccount() {
        this.savingsBalance = 0;
    }
    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    // METHODS
        // GETTERS
    protected double getSavingsBalance() {
        return savingsBalance;
    }
        // SETTERS
    public static void modifyInterestRate(double newAIR) {
        annualInterestRate = newAIR;
    }
    protected void setSavingsBalance(double amount) {
        this.savingsBalance = amount;
    }
        // INSTANCE
    public void calculateMonthlyInterest() {
        this.savingsBalance += this.savingsBalance*annualInterestRate/12;
    }
    public void withdrawSavings(double amount) {
        this.savingsBalance -= amount;
    }
    public void depositSavings(double amount) {
        this.savingsBalance += amount;
    }
}