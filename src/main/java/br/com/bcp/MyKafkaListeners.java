package br.com.bcp;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyKafkaListeners {
    
    @KafkaListener(topics = "bcptopic", groupId = "groupId1")
    void listener(String data) {
        System.out.println("Listener received: " + data);
    }
}
