package com.ibm.zuulsvr.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SleuthConfiguration {

    private RestTemplate restTemplate;

    @Autowired
    public SleuthConfiguration(final RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Bean
    public Sampler buildAlwaysSampler() {
        return new AlwaysSampler();
    }
}
