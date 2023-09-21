package com.example.demo.retry;

import com.example.demo.model.RetryConfig;
import com.example.demo.repository.RetryDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Slf4j
@Service
public class TestInternalRetry {

    @Autowired
    RetryDAO retryDAO;

    public Boolean invokeFunction() {
        RetryConfig retryConfig = retryDAO.getRetryConfig();
        log.info("{}", retryConfig);
        RetryService<Boolean> retryService = new RetryService<>(retryConfig.getRetryAttempts(), retryConfig.getTimeToWait());
        return retryService.retry(() -> sendRequest()); // Use VPN for positive case
    }

    public static boolean sendRequest() throws IOException, InterruptedException {

        boolean isAccesible = false;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest
                .newBuilder(URI.create("https://thepiratebay.org/search.php?q=top100:201"))
                .GET()
                .timeout(Duration.ofSeconds(5))
                .build();

        String resp = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
        log.info(resp);

        if (resp!=null) {
            isAccesible = true;
        }

        return isAccesible;
    }

}
