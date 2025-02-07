package com.info.SOLIDPrinciple.DIP.BadCode;

public class NotificationService {

    /* This is violation of dependency inversion principle
       where high level module NotificationService depends directly on
       low level module EmailService & SmsService
       This is tightly coupled on email & sms service. That makes testing also difficult
    **/
    private final EmailService emailService;
    private final SmsService smsService;

    public NotificationService() {
        this.smsService = new SmsService();
        this.emailService = new EmailService();
    }

    public void notifyByEmail(String message) {
        emailService.sendEmail(message);
    }

    public void notifyBySms(String message) {
        smsService.sendMessage(message);
    }
}
