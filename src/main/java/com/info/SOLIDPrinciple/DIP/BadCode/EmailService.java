package com.info.SOLIDPrinciple.DIP.BadCode;

public class EmailService {

    void sendEmail(String message) {
        System.out.printf("sending a message through email with content : %s%n", message);
    }
}
