package com.info.SOLIDPrinciple.OCP.GoodCode;

public class CreditCard implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.printf("Making a payment using credit card to pay amount %.2f %n", amount);
    }
}
