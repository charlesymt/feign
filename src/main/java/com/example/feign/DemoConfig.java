package com.example.feign;

import feign.Request.Options;
import org.springframework.context.annotation.Bean;

/**
 * @author Charles Yu
 */
public class DemoConfig {

    @Bean
    public Options options() {
        return new Options(1000, 120 * 1000);
    }
}
