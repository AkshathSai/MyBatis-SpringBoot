package com.example.demo.repository;

import com.example.demo.mapper.RetryConfigMapper;
import com.example.demo.model.RetryConfig;
import org.springframework.stereotype.Repository;

@Repository
public class RetryDAO {

    public final RetryConfigMapper mapper;

    public RetryDAO(RetryConfigMapper mapper) {
        this.mapper = mapper;
    }


    public RetryConfig getRetryConfig() {
        String retries = mapper.getRetryAttempts();
        String timeToWait = mapper.getTimeToWait();
        return new RetryConfig(Integer.parseInt(retries), Integer.parseInt(timeToWait));
    }

}
