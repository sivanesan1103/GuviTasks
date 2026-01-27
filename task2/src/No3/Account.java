package No3;

class Account {

    double balance;


    Account() {
        balance = 0;
    }

    Account(double balance) {

        this.balance = balance;
    }


    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }


    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }


    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}
