package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        BankAccount bobsAccount = new BankAccount();
        bobsAccount.withdrawl(100.0);

        bobsAccount.deposit(50.);
        bobsAccount.withdrawl(100);

        bobsAccount.deposit(51);
        bobsAccount.withdrawl(100);

	// write your code here
    }
}
