package com.nitasha.notification_service.consumer;

import com.nitasha.notification_service.event.OrderEvent;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationConsumer {

    @KafkaListener(topics = "order-placed", groupId = "notification-group")
    public void handleOrderPlaced(OrderEvent event) {
        System.out.println("📧 Notification received from Kafka: " + event);
        System.out.println("📧 Sending notification to customer...");
        // In real app: send email/SMS/push notification here
    }
}