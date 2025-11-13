enum BankName {
    ICICI(6.3), HDFC(5.8), SBI(6.0);

    double interestRate;

    BankName(double interestRate) {
        this.interestRate = interestRate;
    }

    double getInterestRate() {
        return interestRate;
    }
}

/**
 * Represents a bank account with basic banking operations.
 */
class BankAccount {
    /** Name of the account holder */
    String accountHolderName;
    /** Current balance in the account */
    double balance;
    /** Bank where the account is held */
    BankName bankName;

    public BankAccount(String accountHolderName, double balance, BankName bankName) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.bankName = bankName;
    }

    void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be positive");
            return;
        }
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be positive");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Error: Insufficient balance");
        }
    }

    void printBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    void calculateInterest(int years) {
        if (years <= 0) {
            System.out.println("Error: Years must be positive");
            return;
        }
        double totalInterest = balance * (bankName.getInterestRate() / 100) * years;
        System.out.printf("Total Interest: ₹%.2f%n", totalInterest);
    }

    void getAccountBalance() {
        System.out.printf("Account Balance: ₹%.2f%n", balance);
    }
}
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Alice", 1000.0, BankName.HDFC);
        account.getAccountBalance();
        account.printBankName();
        account.calculateInterest(2);
        account.deposit(500.0);
        account.getAccountBalance();
        account.withdraw(300.0);
        account.getAccountBalance();
    }
}