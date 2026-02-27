class Account {
    String name;
    int accNo;
    String type;
    double balance;

    Account(String name, int accNo, String type, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.type = type;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    void displayBalance() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Type: " + type);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

class SavingsAccount extends Account {
    static final double interestRate = 0.05;

    SavingsAccount(String name, int accNo, double balance) {
        super(name, accNo, "Savings", balance);
    }

    void computeInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest Added: " + interest);
    }
}

class CurrentAccount extends Account {
    static final double minBalance = 1000;
    static final double penalty = 500;

    CurrentAccount(String name, int accNo, double balance) {
        super(name, accNo, "Current", balance);
    }

    void checkMinimumBalance() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty Imposed: " + penalty);
        }
    }
}

public class MainAccount {
    public static void main(String[] args) {

        System.out.println("----- Savings Account -----");
        SavingsAccount s = new SavingsAccount("Amit", 101, 5000);
        s.deposit(1000);
        s.computeInterest();
        s.withdraw(2000);
        s.displayBalance();

        System.out.println("----- Current Account -----");
        CurrentAccount c = new CurrentAccount("Riya", 102, 800);
        c.deposit(200);
        c.withdraw(300);
        c.checkMinimumBalance();
        c.displayBalance();
    }
}