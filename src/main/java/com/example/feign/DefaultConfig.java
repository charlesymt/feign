package com.example.feign;

import feign.Request.Options;
import org.springframework.context.annotation.Bean;

/**
 * @author Charles Yu
 */
public class DefaultConfig {
    @Bean
    public Options options(){
        return new Options(10000, 30000);
    }

}
