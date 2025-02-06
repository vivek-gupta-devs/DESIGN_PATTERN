package com.info.SOLIDPrinciple.OCP.BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount) {
        if ("credit card".equals(paymentMethod)) {
            // Logic to handle credit card feature for amount calculation
            System.out.printf("Making a payment using %s to pay amount %.2f %n", paymentMethod, amount);
        } else if ("debit card".equals(paymentMethod)) {
            // Logic to handle credit card feature for amount calculation
            System.out.printf("Making a payment using %s to pay amount %.2f %n", paymentMethod, amount);
        } else if ("paypal".equals(paymentMethod)) {
            // Logic to handle credit card feature for amount calculation
            System.out.printf("Making a payment using %s to pay amount %.2f %n", paymentMethod, amount);
        } else {
            // Logic to handle credit card feature for amount calculation
            System.out.printf("Making a payment using cash to pay amount %.2f %n", amount);
        }
    }


}
