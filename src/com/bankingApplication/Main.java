package com.bankingApplication;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = createBankManually();
        System.out.println("Welcome to the " + bank.getName() + " system");

        boolean condition = true;
        while(condition) {
            System.out.println("_________________");
            System.out.println("Select the option:");
            System.out.println("1 - add new Customer");
            System.out.println("2 - add new Branch");
            System.out.println("3 - add a transaction for the customer");
            System.out.println("4 - see customers in the branch");
            System.out.println("5 - quit");
            int option = Integer.parseInt(scanner.nextLine());  //to solve the issue when Scanner skips next nextLine()
            if(option < 5 && option > 0) {
                switch(option) {
                    case 1:
                        System.out.println("Enter new customer's name...");
                        String newCustomerName1 = scanner.nextLine();
                        System.out.println("Enter an existing Branch...");
                        String branchName = scanner.nextLine();
                        bank.addNewCustomer(branchName, newCustomerName1);
                        break;
                    case 2:
                        System.out.println("Enter new Branch's name...");
                        String newBranchName1 = scanner.nextLine();
                        System.out.println("Enter new customer's name...");
                        String newCustomerName2 = scanner.nextLine();
                        bank.addNewBranch(newBranchName1, newCustomerName2);
                        break;
                    case 3:
                        System.out.println("Enter Branch's name...");
                        String branchName2 = scanner.nextLine();
                        System.out.println("Enter customer's name...");
                        String customerName3 = scanner.nextLine();
                        System.out.println("Enter new transaction...");
                        double newTransaction1 = Double.parseDouble(scanner.nextLine());
                        bank.addNewTransaction(branchName2, customerName3, newTransaction1);
                        break;
                    case 4:
                        System.out.println("Enter Branch's name you search for...");
                        String newBranchName3 = scanner.nextLine();
                        bank.findBranch(newBranchName3);
                        break;
                }
            } else if(option == 5) {
                System.out.println("Bye bye! :)");
                condition = false;
            } else {
                System.out.println("Choose a proper option. :)");
            }


        }



    }




    public static Bank createBankManually() {
        Customer customer1 = new Customer("Marina");
        Customer customer2 = new Customer("Alina");
        Customer customer3 = new Customer("Katrina");
        ArrayList<Customer> customerList1 = new ArrayList<>();
        customerList1.add(customer1);
        customerList1.add(customer2);
        customerList1.add(customer3);
        Branch branch1 = new Branch();
        branch1.setName("West");
        branch1.setCustomersList(customerList1);

        Customer customer4 = new Customer("Maksim");
        Customer customer5 = new Customer("Veronika");
        Customer customer6 = new Customer("Violetta");
        ArrayList<Customer> customerList2 = new ArrayList<>();
        customerList2.add(customer4);
        customerList2.add(customer5);
        customerList2.add(customer6);
        Branch branch2 = new Branch();
        branch2.setName("East");
        branch2.setCustomersList(customerList2);

        ArrayList<Branch> branchList = new ArrayList<>();
        branchList.add(branch1);
        branchList.add(branch2);
        return new Bank("Alpaca Central Bank", branchList);

    }
}
