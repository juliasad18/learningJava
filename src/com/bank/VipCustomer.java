package com.bank;

public class VipCustomer {
    private String name;
    private long creditLimit;
    private String email;

    public VipCustomer() {
        this("Default", 2000, "default@java.com");
    }

    public VipCustomer(String name, long creditLimit) {
        this(name, creditLimit, "default@java.com");
    }

    public VipCustomer(String name, long creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public long getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
