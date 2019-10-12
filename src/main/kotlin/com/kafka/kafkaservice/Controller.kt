package com.kafka.kafkaservice

import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping(value = "/kafka")
class KafkaController @Autowired
internal constructor(private val producer: Producer) {

    @PostMapping(value = "/publish")
    fun sendMessageToKafkaTopic(@RequestParam("message") message: String) {
        this.producer.sendMessage(message)
    }
}