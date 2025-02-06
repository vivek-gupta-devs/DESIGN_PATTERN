package com.info.SOLIDPrinciple.OCP.GoodCode;

public class DebitCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.printf("Making a payment using debit card to pay amount %.2f %n", amount);
    }
}
