package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        BankAccount bobsAccount = new BankAccount(); //("12345", 0.00, "Bob Brown", "myemail@bob.com", "(123) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(50.);
//        bobsAccount.withdraw(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdraw(100);
//
//        BankAccount timsAccount = new BankAccount("Tim", "timw@email.com", "(123) 456-7890");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Greg", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00);
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
