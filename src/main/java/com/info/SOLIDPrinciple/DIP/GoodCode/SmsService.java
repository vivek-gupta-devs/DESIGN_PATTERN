package com.info.SOLIDPrinciple.DIP.GoodCode;

public class SmsService implements NotificationChannel {
    @Override
    public void send(String message) {
        System.out.printf("sending a message through sms with content : %s%n", message);
    }
}
