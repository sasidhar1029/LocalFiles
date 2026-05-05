package com.javaintro;

public class StateBank {
    String accountHname;
    Long accountNumber;
    Double bankBalance;
    static long nextAccountNumber = 62310100120L;

    void setDetails(String name, Double balance) {
        accountHname = name;
        bankBalance = balance;
        accountNumber = nextAccountNumber;  // assign current number to this account
        nextAccountNumber++;                 // then increment for the next account
    }

    void getDetails() {
        System.out.println("Account Holder: " + accountHname);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Bank Balance: " + bankBalance);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        StateBank acc1 = new StateBank();
        acc1.setDetails("sasi", 25000.0);

        StateBank acc2 = new StateBank();
        acc2.setDetails("arjun", 259000.0);

        StateBank acc3 = new StateBank();
        acc3.setDetails("sasidhar", 52000.0);

        acc1.getDetails();
        acc2.getDetails();
        acc3.getDetails();
    }
}
