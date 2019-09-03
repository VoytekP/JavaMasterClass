package academy.learnprogramming;

public class BankAccount {

    private String Number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhone;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "made. New balance is " + this.balance);
    }

    public void withdrawl(double withdrawlAmount) {
        if (this.balance - withdrawlAmount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawal not processed");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawal of " + withdrawlAmount + " processed. Remaining balance = " + this.balance);
        }
    }

    public void setBalance(double balance) {
        balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(int customerPhone) {
        this.customerPhone = customerPhone;
    }

    public void setAccountNumber(int accountNumber) {
    }
    public String getNumber() {
        return this.Number;
    }

    public void setAccountBalance(double accountBalance) {
    }
    public double getBalance() {
        return this.balance;
    }

    public void setNumber(String number) {
        Number = number;
    }

}
