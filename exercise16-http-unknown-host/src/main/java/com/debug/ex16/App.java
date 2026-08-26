package com.debug.ex16;

import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://httpbin.org/status/200");
        try {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);
            int status = conn.getResponseCode();
            System.out.println("HTTP Status: " + status);
        } catch (java.io.IOException e) {
            System.out.println("Network request completed with exception handling: " + e.getMessage());
        }
    }
}