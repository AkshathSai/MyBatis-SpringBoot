package com.example.demo.controller;

import com.example.demo.retry.TestInternalRetry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class RetryConfigController {

    @Autowired
    TestInternalRetry testInternalRetry;

    @GetMapping("/test")
    public Boolean test() {
        Boolean result = testInternalRetry.invokeFunction();
        log.info("{}", result);
        return result;
    }

}
