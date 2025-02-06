package com.info.SOLIDPrinciple.OCP;


import com.info.SOLIDPrinciple.OCP.GoodCode.CreditCard;
import com.info.SOLIDPrinciple.OCP.GoodCode.PaymentProcessor;

public class Main {

    public static void main(String[] args) {


        PaymentProcessor pm = new PaymentProcessor();
        CreditCard card = new CreditCard();
        pm.processPayment(card,500);
    }
}
