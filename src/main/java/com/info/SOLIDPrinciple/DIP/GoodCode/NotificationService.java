package com.info.SOLIDPrinciple.DIP.GoodCode;

public class NotificationService {

    private NotificationChannel notificationChannel;

    public NotificationService(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void notify(String msg){
        notificationChannel.send(msg);
    }
}
