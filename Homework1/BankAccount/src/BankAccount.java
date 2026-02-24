public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName) {
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public void addMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Transaction successful! Current balance: $" + balance);
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    public void retrieveMoney(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient funds. You cannot retrieve more than $" + balance);
        } else if (amount > 0) {
            balance -= amount;
            System.out.println("Transaction successful! Current balance: $" + balance);
        } else {
            System.out.println("Amount must be greater than zero.");
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }
}
