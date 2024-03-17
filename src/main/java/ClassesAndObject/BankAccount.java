package ClassesAndObject;

import java.time.LocalDateTime;

public class BankAccount {
    final static String COUNTRY = "United States of America";
    String routingNumber;
    String accountNumber;
    String accountHolderFullName;
    double balance;

    public BankAccount(String routingNumber, String accountNumber, String accountHolderFullName, double balance) {
        this.routingNumber = routingNumber;
        this.accountNumber = accountNumber;
        this.accountHolderFullName = accountHolderFullName;
        this.balance = balance;
    }

    public BankAccount(String routingNumber) {
        this(routingNumber, "0", "Unknown", 0.00);
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        this.routingNumber = routingNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderFullName() {
        return accountHolderFullName;
    }

    public void setAccountHolderFullName(String accountHolderFullName) {
        this.accountHolderFullName = accountHolderFullName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    // this method will increase the balance by depositAmount
    double deposit(double depositAmount) {
        return balance += depositAmount;
    }

    // this method will decrease the balance by withdrawAmount
    double withdraw(double withdrawAmount) {
        return balance -= withdrawAmount;
    }

    void checkBalance() {
        System.out.println("The balance is: $" + balance + " Local time is: " + LocalDateTime.now());
    }

    public static void main(String[] args) {
        BankAccount chaseChecking = new BankAccount("081904808", "123456",
                "Ganbaatar Jargal", 10000.99);
        chaseChecking.deposit(100.00);
        chaseChecking.checkBalance();


        BankAccount chaseSaving = new BankAccount("071000013");
        chaseSaving.setAccountNumber("987654");
        chaseSaving.setAccountHolderFullName("John Wick");
        chaseSaving.setBalance(999.99);


        chaseSaving.withdraw(100.0);
        System.out.println(BankAccount.COUNTRY);

    }
}
