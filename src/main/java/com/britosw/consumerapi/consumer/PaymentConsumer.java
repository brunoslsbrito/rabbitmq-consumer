package com.britosw.consumerapi.consumer;

import com.britosw.consumerapi.config.PaymentAMQPConfig;
import com.britosw.consumerapi.model.Payment;
import com.britosw.consumerapi.util.CommonsUtil;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class PaymentConsumer {

    @RabbitListener(queues = PaymentAMQPConfig.QUEUE)
    public void consumer(Message message) {
        var body = CommonsUtil.convertFromByteArray(message);
        var payment = new Gson().fromJson(body, Payment.class);
        log.info(message.toString());
        log.info(payment.toString());
    }

}
