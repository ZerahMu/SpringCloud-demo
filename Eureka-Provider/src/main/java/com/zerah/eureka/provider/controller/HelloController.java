package com.zerah.eureka.provider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: Eureka-Provider
 * @author: Mr.Zerah
 * @create: 2020-01-13 22:18
 * @description:
 **/
@RestController
@Slf4j
public class HelloController {
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello" ,method = RequestMethod.GET)
    public String index(){
        log.info("Description:"+ client.description()+ ", order:"+ client.getOrder());
        client.getServices().forEach(a -> System.out.println(a));
//        List<ServiceInstance> instanceList = client.getInstances("localhost");
//        instanceList.forEach(a-> System.out.println("/hello,host:"+a.getHost() +", serviceId:"+ a.getServiceId()));
        return "Hello,World";
    }
}
