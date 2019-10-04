package academy.learnprogramming;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Greg", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);
        System.out.println("Balance for customer for customer " + customer.getName() + " is " + customer.getBalance());

        // Another example
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
        System.out.println("*************");

        intList.add(1,2);

        for (int i=0; i<intList.size(); i++) {
            System.out.println(i + ": " + intList.get(i));
        }
    }
}
