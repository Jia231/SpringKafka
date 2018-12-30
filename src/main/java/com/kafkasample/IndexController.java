package com.kafkasample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.kafkasample.producer.KafkaProducerConfig;

@RestController
public class IndexController{
 

    @Autowired
    KafkaProducerConfig kafkaSender;

    @PostMapping("/kafka/{topicName}")
    public String sendToTopic(@PathVariable String topicName, @RequestBody String message) {
        kafkaSender.send(topicName, message);
        return "Message sent";
    }

    @RequestMapping("/")
    public String index(){
        String str = "Hello from Spring";
        
        return str;
    }
}