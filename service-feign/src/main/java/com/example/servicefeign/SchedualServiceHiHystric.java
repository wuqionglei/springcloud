package com.example.servicefeign;

import org.springframework.stereotype.Component;

/**
 * @author wuqionglei
 * @date 2019/9/15 14:00
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}