package com.zerah.cloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @program: Eureka-Consumer
 * @author: Mr.Zerah
 * @create: 2020-01-15 21:28
 * @description: 消费者
 **/
@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer")
    public String helloConsumer(){
        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class ).getBody();
    }
}
