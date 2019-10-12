package com.kafka.kafkaservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KafkaserviceApplication

fun main(args: Array<String>) {
	runApplication<KafkaserviceApplication>(*args)

}
