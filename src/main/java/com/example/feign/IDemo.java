package com.example.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Charles Yu
 */
@FeignClient(url = "http://localhost:8080", name = "demo", configuration = DemoConfig.class)
public interface IDemo {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    void test();
}
