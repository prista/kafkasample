package com.drmcode.kafkaexample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.kafka.core.KafkaTemplate;

import java.time.LocalDateTime;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class MessageControllerTest {

    @Mock
    private KafkaTemplate<String, String> kafkaTemplate;

    @InjectMocks
    private MessageController messageController;

    @Test
    void testPublish() {
        var messageRequest = new MessageRequest("Test message");
        messageController.publish(messageRequest);
        verify(kafkaTemplate).send("amigoscode", messageRequest.message());
    }
}
