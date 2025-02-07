package com.info.SOLIDPrinciple.DIP.GoodCode;

public class Main {

    public static void main(String[] args) {

        EmailService email = new EmailService();
        NotificationService notifyByEmail = new NotificationService(email);
        notifyByEmail.notify("Request to complete your course on time.");


        SmsService sms = new SmsService();
        NotificationService notifyBySms = new NotificationService(sms);
        notifyBySms.notify("Requesting for new otp.");
    }
}
