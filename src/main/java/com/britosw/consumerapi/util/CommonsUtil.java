package com.britosw.consumerapi.util;

import org.springframework.amqp.core.Message;

import java.nio.charset.Charset;

public class CommonsUtil {
    public static String convertFromByteArray(Message message) {
        return new String(message.getBody(), Charset.forName("utf8"));
    }
}
