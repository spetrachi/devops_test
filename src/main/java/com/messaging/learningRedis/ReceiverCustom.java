package com.messaging.learningRedis;

import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/*
 * Classe POJO che fa da message receiver
 */

public class ReceiverCustom {
	private static final Logger LOGGER = LoggerFactory.getLogger(ReceiverCustom.class);
	
	private AtomicInteger counter = new AtomicInteger();
	
	// message handler
	public void receiveMessage(String message) {
        LOGGER.info("Received <" + message + ">");
        counter.incrementAndGet();
    }

    public int getCount() {
        return counter.get();
    }
}
