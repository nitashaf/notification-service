package com.nitasha.notification_service.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "order-placed", groupId = "notification-group")
    public void handleOrderPlaced(String message) {
        System.out.println("📧 Notification received from Kafka: " + message);
        System.out.println("📧 Sending notification to customer...");
        // In real app: send email/SMS/push notification here
    }
}