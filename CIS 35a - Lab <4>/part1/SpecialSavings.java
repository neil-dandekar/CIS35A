// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part1;

public class SpecialSavings extends SavingsAccount{
    // CONSTRUCTORS
    SpecialSavings(double savingsBalance) {
        super(savingsBalance);
    } 

    // METHODS
        // INSTANCE
    @Override
    public void calculateMonthlyInterest() {
        double savingsBalance = getSavingsBalance();
        if(savingsBalance > 10000) {
            setSavingsBalance(savingsBalance + (savingsBalance*0.1)/12);
        }
        else super.calculateMonthlyInterest();
    }
}