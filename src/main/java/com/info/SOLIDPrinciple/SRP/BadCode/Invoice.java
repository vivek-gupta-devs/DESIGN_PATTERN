package com.info.SOLIDPrinciple.SRP.BadCode;


public class Invoice {

    private final double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    // Additional Functionality
    public void generateInvoice() {
        System.out.printf("invoice generated & printed for amount %.2f %n", amount);
    }

    public void saveToDatabase() {
        System.out.println("saving invoice to database");
    }

    public void sendEmailNotification() {
        System.out.println("sending email notification for generated invoice");
    }
}
