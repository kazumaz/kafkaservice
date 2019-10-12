package com.kafka.kafkaservice

import org.slf4j.LoggerFactory
import java.io.IOException
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class Consumer {

    private val logger = LoggerFactory.getLogger(Producer::class.java)

    @KafkaListener(topics = ["test01"], groupId = "group_id")
    @Throws(IOException::class)
    fun consume(message: String) {
        logger.info(String.format("#### -> Consumed message -> %s", message))
    }
}