package com.bankingApplication;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branchesList;

    public Bank(String name,  ArrayList<Branch> branchesList) {
        this.name = name;
        this.branchesList = branchesList;
    }

    public String getName() {
        return name;
    }

    public void addNewBranch(String branchName, String customerName) {
        int index = findBranchIndex(branchName);
        if(index == -1) {
            Branch newBranch = new Branch();
            newBranch.setName(branchName);
            newBranch.addNewCustomer(customerName);
            branchesList.add(newBranch);
            System.out.println("New Branch created");
        } else {
            System.out.println("Branch with the same name already exists.");
        }

    }

    public void addNewTransaction(String branchName, String customerName, double transaction) {
        int indexBranch = findBranchIndex(branchName);
        if(indexBranch == -1) {
            System.out.println("Branch doesn't exist.");
        } else {
            if(branchesList.get(indexBranch).addNewTransaction(customerName, transaction)) {
                System.out.println("Branch name: " + branchesList.get(indexBranch).getName() + " updated.");
            } else {
                System.out.println("Bank: ups!");
            }


        }

    }

    public void addNewCustomer(String branchName, String customerName) {
        int index = findBranchIndex(branchName);
        if(index == -1) {
            System.out.println("Branch doesn't exist. Create new branch first.");
        } else {
            Branch branch = branchesList.get(index);
            if(branch.addNewCustomer(customerName)) {
                System.out.println("Bank: Customer successfully created.");
                System.out.println("Bank: Customer name: " + name);
                System.out.println("Bank: Existing branch: " + branch.getName());
            }
        }
    }

    private int findBranchIndex(String branchName) {
        int index = -1;
        for(int i = 0; i < branchesList.size(); i++) {
            String name = branchesList.get(i).getName();
            if(branchName.equals(name)) {
                index = i;
            }
        }
        return index;
    }

    public void findBranch(String branchName) {
        for(int i = 0; i < branchesList.size(); i++) {
            Branch branch =  branchesList.get(i);
            if(branchName.equals(branch.getName())) {
                System.out.println("Branch name: " + branch.getName());
                ArrayList<Customer> customersList = branchesList.get(i).getCustomersList();
                for(int k = 0; k < customersList.size(); k++) {
                    Customer customer = customersList.get(k);
                    System.out.println("Customer name: " + customer.getName());
                    ArrayList<Double> transactionsList = customer.getTransactionsList();
                    for(int t = 0; t < transactionsList.size(); t++) {
                        System.out.println("Customer transaction: " + transactionsList.get(t));
                    }
                    System.out.println("________________________");
                }

            }
        }
    }

}