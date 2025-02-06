package com.info.SOLIDPrinciple.SRP.GoodCode;


public class Invoice {

    private final double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional Functionality
    public void generateInvoice() {
        System.out.printf("invoice generated & printed for amount %d%n", amount);
    }

}
