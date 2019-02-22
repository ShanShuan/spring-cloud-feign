package com.shanshuan.feign.fallback;

import com.shanshuan.feign.iterface.ConsumerService;
import org.springframework.stereotype.Component;

@Component
public class HelloFallBack implements ConsumerService {
    @Override
    public String test() {
        return "触发了 熔断器功能！";
    }
}
