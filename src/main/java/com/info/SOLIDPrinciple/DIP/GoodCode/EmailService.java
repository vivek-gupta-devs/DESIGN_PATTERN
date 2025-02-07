package com.info.SOLIDPrinciple.DIP.GoodCode;

public class EmailService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.printf("sending a message through email with content : %s%n", message);
    }
}
