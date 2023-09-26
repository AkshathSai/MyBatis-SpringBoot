package com.example.demo.retry;

import com.example.demo.model.RetryConfig;
import com.example.demo.repository.RetryDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestInternalRetry {

    @Autowired
    RetryDAO retryDAO;

    public Boolean invokeFunction() {
        RetryConfig retryConfig = retryDAO.getRetryConfig();
        log.info("{}", retryConfig);
        RetryService<Boolean> retryService = new RetryService<>(retryConfig.getRetryAttempts(), retryConfig.getTimeToWait());
        return retryService.retry(() -> WebRequest.sendRequest()); // Use VPN for positive case
    }


}
