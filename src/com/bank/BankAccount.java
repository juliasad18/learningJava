package com.bank;

public class BankAccount {
    private long number;
    private long balance;
    private String customerName;
    private String customerEmail;
    private long customerPhoneNumber;

    //create default values in cese if values are not provided
    public BankAccount() {
        this(123000, 0, "John", "john@java.com", 111222333);
        System.out.println("Default constructor was called!!!!");
    }

    public BankAccount(long number, long balance, String customerName, String customerEmail, long customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
        System.out.println("Account constructor was called!!!!");
    }

    public long getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setAccountNumber(long number) {
        this.number = number;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void increaseBalance(long depositFunds) {
        this.balance = this.balance + depositFunds;
        System.out.println("Customer has increased his balance. The new balance is: " + balance);
    }

    public void decreaseBalance(long withdrawFunds) {
        if (withdrawFunds <= this.balance) {
            this.balance = this.balance - withdrawFunds;
            System.out.println("Customer has decreased his balance. The new balance is: " + balance);
        } else {
            System.out.println("Insufficient funds on Your balance. Current balance is: " + balance);
        }

    }


}
