package com.ryancowger;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipPerson(){
        this("Default name", 5000.00, "Default@email.com");
    }
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

