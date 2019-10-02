package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("ING Bank");

        if (bank.addBranch("Ustron")) {
            System.out.println("Ustron branch created");
        }

        bank.addCustomer("Ustron", "Greg", 50.05);
        bank.addCustomer("Ustron", "Bob", 175.30);
        bank.addCustomer("Ustron", "Will", 220.20);

        bank.addBranch("Warszawa");
        bank.addCustomer("Warszawa", "Jim", 150.67);

        bank.addCustomerTransaction("Ustron", "Greg", 44.22);
        bank.addCustomerTransaction("Ustron", "Greg", 12.44);
        bank.addCustomerTransaction("Ustron", "Bob", 1.65);

        bank.listCustomers("Ustron", true);
        bank.listCustomers("Warszawa", true);

        bank.addBranch("Skoczow");

        if (!bank.addCustomer("Skoczow", "Brian", 5.53)) {
            System.out.println("Error Skoczow branch does not exist");
        }

        if(!bank.addBranch("Ustron")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Ustron", "Fergus", 52.33)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Ustron", "Greg", 12.21)) {
            System.out.println("Customer Greg already exists");
        }

    }
}
