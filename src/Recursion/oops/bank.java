/*
Write a Java program to create a base class BankAccount with methods deposit() and withdraw().
Create two subclasses SavingsAccount and CheckingAccount.
Override the withdraw() method in each subclass to impose different withdrawal limits and fees.

 */

package Recursion.oops;

public class bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(10000, 1000);
        CheckingAccount checkingAccount = new CheckingAccount(2000, 20);


        System.out.println("SavingsAccount:");
        savingsAccount.deposit(500);
        savingsAccount.withdraw(100);


        System.out.println("\nCheckingAccount:");
        checkingAccount.deposit(500);
        checkingAccount.withdraw(50);

    }
    static class BankAccount {
        private double balance ;

        public BankAccount(double initBalance) {
            this.balance=initBalance;
        }
        public void deposit (double amount) {
            balance += amount;
            System.out.println("Deposit: ₹ " + amount);
            displayBalance() ;
        }
        public void withdraw(double amount) {
           if (amount <= balance) {
              balance -= amount ;
               System.out.println("withdrawal successful");
               displayBalance();
           } else {
               System.out.println("cannot withdraw");
           }
        }
        public double Bal() {
            return balance ;
        }
        public void displayBalance() {
            System.out.println("Current Balance : ₹ " + balance);
        }
    }
    static class SavingsAccount extends BankAccount  {
        private double withdrawalLimit;

        public SavingsAccount(double initBalance, double withdrawalLimit) {
            super(initBalance);
            this.withdrawalLimit = withdrawalLimit;
        }
        public void withdraw(double amount) {
            if(amount <= withdrawalLimit) {
                super.withdraw(amount);
                System.out.println("Withdrawal of money successful from the savings account");
                displayBalance();
            } else {
                System.out.println("Cannot withdraw");
            }
        }
    }
    static class CheckingAccount extends BankAccount {
        private double withdrawalFee ;

        public CheckingAccount(double initBalance, double withdrawalFee ) {
            super(initBalance);
            this.withdrawalFee = withdrawalFee ;
        }
        public void withdraw(double amount) {
            if(amount + withdrawalFee <= Bal()) {
                super.withdraw(amount+withdrawalFee);
                System.out.println("successfully withdrawal");
                displayBalance();
            } else {
                System.out.println("withdrawal fail !");
            }
        }
    }
}
