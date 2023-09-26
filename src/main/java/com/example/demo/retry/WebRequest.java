package com.example.demo.retry;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

@Slf4j
public final class WebRequest {

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
