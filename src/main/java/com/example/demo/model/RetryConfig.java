package com.example.demo.model;

import java.io.Serializable;

public class RetryConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private int retryAttempts;
    private int timeToWait;

    public int getRetryAttempts() {
        return retryAttempts;
    }

    public void setRetryAttempts(int retryAttempts) {
        this.retryAttempts = retryAttempts;
    }

    public int getTimeToWait() {
        return timeToWait;
    }

    public void setTimeToWait(int timeToWait) {
        this.timeToWait = timeToWait;
    }

    public RetryConfig() {

    }

    public RetryConfig(int retryAttempts, int timeToWait) {
        this.retryAttempts = retryAttempts;
        this.timeToWait = timeToWait;
    }

    @Override
    public String toString() {
        return "RetryConfig{" +
                "retryAttempts=" + retryAttempts +
                ", timeToWait=" + timeToWait +
                '}';
    }
}
