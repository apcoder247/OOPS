class BankAccount {
    String name;
    int accNo;
    String type;
    double balance;
    static double rate = 5.0;

    BankAccount() {
        name = "NA";
        accNo = 0;
        type = "Saving";
        balance = 0;
    }

    BankAccount(String n, int a, String t, double b) {
        name = n;
        accNo = a;
        type = t;
        balance = b;
    }

    void deposit(double amt) {
        balance += amt;
    }

    void withdraw(double amt) {
        if (balance - amt >= 1000)
            balance -= amt;
        else
            System.out.println("Minimum balance required");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Type: " + type);
        System.out.println("Balance: " + balance);
    }

    static void showRate() {
        System.out.println("Rate of Interest: " + rate + "%");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount("Neha", 12345, "Saving", 5000);

        b1.display();
        b2.display();

        b2.deposit(2000);
        b2.withdraw(3000);
        b2.display();

        BankAccount.showRate();
    }
}
