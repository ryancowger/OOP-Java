package com.ryancowger;

public class Main {

    public static void main(String[] args) {
//	    Account bobsAccount = new Account(); //"12345", 1.00, "Ryan Cowger, ", "ryan@email.com","(618) 535-7963");
//
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
//
//
//	    bobsAccount.deposit(50.00);
//	    bobsAccount.withdrawal(100.00);
//
//	    bobsAccount.deposit(51.00);
//	    bobsAccount.withdrawal(100.00);
//
//	    Account ryansAccount = new Account("Ryan", "ryan@email.com", "123456");
//        System.out.println(ryansAccount.getNumber() + " Name " + ryansAccount.getCustomerName());

        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 25000.00);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Ryan", 100.00, "Ryan@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());
    }
}
