package com.ryancowger;

public class Account {
    private String Number;
    private double Balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("56789", 2.50, " Default name", "Default address","default phone");
        System.out.println("Empty constructor called");
    }
    public Account(String Number, double balance, String customerName,String customerEmailAddress,
                   String customerPhoneNumber){
        System.out.println("Account constructors with parameters called");
        this.Number = Number;
        this.Balance= Balance;
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;

    }

    public Account(String customerName, String customerPhoneNumber, String customerEmailAddress) {
        this("99999",100.55, customerName, customerEmailAddress, customerPhoneNumber);
//        this.customerPhoneNumber = customerPhoneNumber;
//        this.customerEmailAddress = customerEmailAddress;
//        this.customerName = customerName;
    }

    public void deposit(double depositAmount){
        this.Balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + " made. New balance is " + this.Balance );
    }
    public void withdrawal(double withdrawlAmount){
        if (this.Balance - withdrawlAmount < 0){
            System.out.println("Only " +this.Balance + " available. Withdrawl not processed");
        }else {
            this.Balance -= withdrawlAmount;
            System.out.println("Withdrawal of " + withdrawlAmount + " processed. Remaining balance = " + this.Balance);
        }
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double Balance) {
        this.Balance = Balance;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }
}
