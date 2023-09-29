package com.example.backlenguajesformales.services;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class CedulaValidationService {
    @Value("${api.external.url}")
    private String apiUrl;

    @Value("${api.external.key}")
    private String apiKey;

    public Response validateCedula() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(apiUrl)
                .get()
                .addHeader("Accept", "application/json")
                .addHeader("Authorization", apiKey)
                .build();

        return client.newCall(request).execute();
    }
}

