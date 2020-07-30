package com.bank;

import com.wall.Wall;

public class Application {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(123456);
        bankAccount.setBalance(500);
        bankAccount.setCustomerName("Alice");
        bankAccount.setCustomerEmail("alice@java.com");
        bankAccount.setCustomerPhoneNumber(26272340);

        System.out.println("____________________________________________________________");
        System.out.println(" ");
        System.out.println("Customer name is: " + bankAccount.getCustomerName());

        if (!bankAccount.getCustomerName().equals("Alice")) {
            System.out.println("Ooops! Something went wrong with customer name");
        }

        System.out.println("Customer email is: " + bankAccount.getCustomerEmail());

        if (!bankAccount.getCustomerEmail().equals("alice@java.com")) {
            System.out.println("Ooops! Something went wrong with customer email");
        }

        System.out.println("Customer banc account is: " + bankAccount.getNumber());

        if (bankAccount.getNumber() != 123456) {
            System.out.println("Ooops! Something went wrong with customer account number");
        }

        System.out.println("Customer phone number is: " + bankAccount.getCustomerPhoneNumber());

        if (bankAccount.getCustomerPhoneNumber() != 26272340) {
            System.out.println("Ooops! Something went wrong with customer phone number");
        }

        System.out.println("Customer balance is: " + bankAccount.getBalance());

        if (bankAccount.getBalance() != 500) {
            System.out.println("Ooops! Something went wrong with customer balace");
        }

        System.out.println("");
        bankAccount.increaseBalance(300);

        if (bankAccount.getBalance() != 800) {
            System.out.println("Ooops! Something went wrong with customer balace");
        }

        System.out.println("");
        bankAccount.decreaseBalance(400);

        if (bankAccount.getBalance() != 400) {
            System.out.println("Ooops! Something went wrong with customer balace");
        }

        System.out.println("");
        bankAccount.decreaseBalance(401);

        VipCustomer vipCustomer1 = new VipCustomer();
        VipCustomer vipCustomer2 = new VipCustomer("Valerie", 1000);
        VipCustomer vipCustomer3 = new VipCustomer("Mila", 8000, "mila@java.com");

        System.out.println(" ");
        System.out.println("____________________________________________________________");
        System.out.println(" ");
        System.out.println("1st constructor check. Default name is: " + vipCustomer1.getName());
        System.out.println("1st constructor check. Default credit limit is: " + vipCustomer1.getCreditLimit());
        System.out.println("1st constructor check. Default e-mail is: " + vipCustomer1.getEmail());
        System.out.println(" ");
        System.out.println("2nd constructor check. Customer name is: " + vipCustomer2.getName());
        System.out.println("2nd constructor check. Customer credit limit is: " + vipCustomer2.getCreditLimit());
        System.out.println("2nd constructor check. Default e-mail is: " + vipCustomer2.getEmail());
        System.out.println(" ");
        System.out.println("3rd constructor check. Customer name is: " + vipCustomer3.getName());
        System.out.println("3rd constructor check. Customer credit limit is: " + vipCustomer3.getCreditLimit());
        System.out.println("3rd constructor check. Default e-mail is: " + vipCustomer3.getEmail());
        System.out.println(" ");



    }
}
