package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        Account gregsAccount = new Account("Greg");
        gregsAccount.deposit(1000);
        gregsAccount.withdraw(500);
        gregsAccount.withdraw(-200);
        gregsAccount.deposit(-20);
        gregsAccount.calculateBalance();

        System.out.println("Balance on account is " + gregsAccount.getBalance());
    }
}
