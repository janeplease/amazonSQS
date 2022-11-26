package com.example.springsqs.receiver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MessageReceiver {

    @SqsListener(value = "vaishqueue")
    public void receiveMessage(String message) {
        log.info("Message received {}", message);
    }


}
