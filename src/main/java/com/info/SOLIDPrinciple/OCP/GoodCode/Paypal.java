package com.info.SOLIDPrinciple.OCP.GoodCode;

public class Paypal implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.printf("Making a payment using paypal to pay amount %.2f %n", amount);
    }
}
