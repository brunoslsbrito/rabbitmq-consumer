package com.britosw.consumerapi.consumer;

import com.britosw.consumerapi.config.PaymentAMQPConfig;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class PaymentConsumer {
    @RabbitListener(queues = PaymentAMQPConfig.QUEUE)
    public void consumer(Message message) {
        // envio para o WebSocket
    }
}
