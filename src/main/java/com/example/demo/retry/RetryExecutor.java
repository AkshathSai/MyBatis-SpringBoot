package com.example.demo.retry;

@FunctionalInterface
public interface RetryExecutor<T> {

    T run() throws Exception;

}
