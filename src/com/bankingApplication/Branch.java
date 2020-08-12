package com.bankingApplication;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customersList;

    public Branch() {
    }

    public ArrayList<Customer> getCustomersList() {
        return customersList;
    }

    public String getName() {
        return name;
    }

    public void setCustomersList(ArrayList<Customer> customersList) {
        this.customersList = customersList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addNewCustomer(String name) {
        int index = getIndexByName(name);
        if(index == -1) {
            Customer newCustomer = new Customer(name);
            if(customersList != null) {
                customersList.add(newCustomer);
            } else {
                ArrayList<Customer> customerArrayList = new ArrayList<>();
                customerArrayList.add(newCustomer);
                setCustomersList(customerArrayList);
            }
            return true;
        } else {
            System.out.println("Customer with such name already exists.");
            return false;
        }
    }

    public boolean addNewTransaction(String name, double transaction) {
        int index = getIndexByName(name);
        if(index == -1) {
            System.out.println("Customer doesn't exist.");
            return false;
        } else {
            customersList.get(index).getTransactionsList().add(transaction);
            return true;
        }

    }

    private int getIndexByName(String name) {
        int index = -1;
        if(customersList != null) {
            for(int i = 0; i < customersList.size(); i++) {
                if(name.equals(customersList.get(i).getName())) {
                    index = i;
                }
            }
        }
        return index;
    }
}
