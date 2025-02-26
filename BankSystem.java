    abstract class BankAccount {
        private String accountNumber;
        private double balance;
        protected static double interestRate = 3.5; // Common interest rate for all accounts


        public BankAccount(String accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }


        public abstract void calculateInterest();


        public void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
            System.out.println("Interest Rate: " + interestRate + "%");
        }


        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }


    class SavingsAccount extends BankAccount {
        public SavingsAccount(String accountNumber, double balance) {
            super(accountNumber, balance);
        }


        @Override
        public void calculateInterest() {
            double interest = (getBalance() * interestRate) / 100;
            System.out.println("Calculated Interest for Savings Account: " + interest);
        }
    }


    public class BankSystem {
        public static void main(String[] args) {
            SavingsAccount savingsAccount = new SavingsAccount("SA12345", 20000);
            savingsAccount.displayAccountDetails();
            savingsAccount.calculateInterest();
        }
    }


