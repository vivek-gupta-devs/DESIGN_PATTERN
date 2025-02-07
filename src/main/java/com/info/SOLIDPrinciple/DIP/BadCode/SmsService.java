package com.info.SOLIDPrinciple.DIP.BadCode;

public class SmsService {

    public void sendMessage(String message) {
        System.out.printf("sending a message through sms with content : %s%n", message);
    }
}
