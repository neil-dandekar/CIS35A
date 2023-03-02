// Name:               Neil Dandekar
// Class [Section]:    CIS 35A [36Y]
// Assignment Number:  4 (Part1)
// Due Date:           02.27.2023
// Date Submitted:     02.27.2023
// __________________________________

package part1;

public class Driver1 {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        System.out.printf("Initial Balances: \n");
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(0.04);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("\nApply 4%% Annual Interest: \n");
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());
        
        SavingsAccount.modifyInterestRate(0.05);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("\nApply 5%% Annual Interest: \n");
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());

        saver1.withdrawSavings(1000);
        saver2.withdrawSavings(1000);
        System.out.printf("\nWithdraw $1000: \n");
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());

        saver1.depositSavings(3000);
        saver2.depositSavings(3000);
        System.out.printf("\nDeposit $3000: \n");
        System.out.printf("$%.2f\n", saver1.getSavingsBalance());
        System.out.printf("$%.2f\n", saver2.getSavingsBalance());

        // Thank you statement:
        System.out.printf("\nThank you for using my program. \n-Neil Dandekar, 02.27.2023\n");
    }
}

/* TEST RUN:

    Initial Balances: 
    $2000.00
    $3000.00

    Apply 4% Annual Interest: 
    $2006.67
    $3010.00

    Apply 5% Annual Interest: 
    $2015.03
    $3022.54

    Withdraw $1000: 
    $1015.03
    $2022.54

    Deposit $3000: 
    $4015.03
    $5022.54

END TEST RUN */