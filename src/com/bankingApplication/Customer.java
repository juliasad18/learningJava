package com.bankingApplication;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsList;
    //private ArrayList<Double> defaultTransaction = new ArrayList<>();

    public Customer() {
    }

    public Customer(String name) {
        this(name, new ArrayList<>(Arrays.asList(0.0)));
    }

    public Customer(String name, ArrayList<Double> transactionsList) {
        this.name = name;
        this.transactionsList = transactionsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransactionsList() {
        return transactionsList;
    }

    public void setTransactionsList(ArrayList<Double> transactionsList) {
        this.transactionsList = transactionsList;
    }

    public void addCustomer(String name, double transaction) {
        this.name = name;
        transactionsList.add(transaction);
    }


}
