class BankAccount {
    String accountHolderName;
    double balance;
    String bankName;

    public BankAccount(String accountHolderName, double initialBalance, String bankName) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.bankName = bankName;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    void getAccountBalance() {
        System.out.println("Account Balance: " + balance);
    }


        public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 1000.0, "ABC Bank");
        account.getAccountBalance();
        account.deposit(500.0);
        account.getAccountBalance();
        account.withdraw(200.0);
        account.getAccountBalance();
        account.withdraw(2000.0);
    }
}

