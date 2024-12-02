package com.jpmc.midascore.component;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.jpmc.midascore.foundation.Transaction;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {


    @KafkaListener(topics = "Transaction", groupId = "Consumer")
    public void listen(ConsumerRecord<String, Transaction> record) throws JsonProcessingException {

        Transaction transaction = record.value();
        System.out.println(transaction);
    }
}
