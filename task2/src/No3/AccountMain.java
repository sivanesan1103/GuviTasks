package No3;

public class AccountMain {

    public static void main(String[] args) {


        Account acc1 = new Account();
        acc1.displayBalance();

        acc1.deposit(5000);
        acc1.withdraw(2000);
        acc1.displayBalance();




        Account acc2 = new Account(10000);
        acc2.displayBalance();

        acc2.withdraw(3000);
        acc2.displayBalance();
    }
}