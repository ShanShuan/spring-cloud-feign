package com.shanshuan.feign.controller;

import com.shanshuan.feign.iterface.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Qualifier("helloFallBack")
    @Autowired
    private  ConsumerService consumerService;

    @RequestMapping(value = "feign-concumer")
    public String test() {

        return consumerService.test();
    }
}
