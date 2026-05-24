package com.debug.ex16;

import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {

        URL url = new URL("https://httpbin.org2/status/200");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        int status = conn.getResponseCode();
        System.out.println("HTTP Status: " + status);
    }
}