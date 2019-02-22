package com.shanshuan.feign.iterface;

import com.shanshuan.feign.fallback.HelloFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="hello-service",fallback = HelloFallBack.class)
public interface ConsumerService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String test();
}
