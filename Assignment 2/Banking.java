class BankAccount {
    String accountHolder;
    double balance;
    static double interestRate = 4.5;

    BankAccount(String holder, double balance) {
        this.accountHolder = holder;
        this.balance = balance;
    }

    void deposit(double amount) {
        double bonus = 10;
        balance += amount + bonus;
        System.out.println(accountHolder + " deposited ₹" + amount + " (Bonus ₹" + bonus + ")");
    }

    void showAccount() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class Banking {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("shivam", 1000);
        BankAccount acc2 = new BankAccount("sunny", 2000);

        acc1.deposit(500);
        acc2.deposit(1000);

        acc1.showAccount();
        acc2.showAccount();

        BankAccount.interestRate = 6.0;//statice variable always belongs to class only not object 

        System.out.println("\nAfter Updating Interest Rate:");
        acc1.showAccount();
        acc2.showAccount();
    }
}
