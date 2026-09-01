package com.debug.ex16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class App {
    public static void main(String[] args) throws Exception {
        // Solution: Provide a valid, resolvable hostname (e.g. 'httpbin.org' instead of misspelled 'httpbin.org2').
        // Why: The JVM network subsystem delegates DNS resolution to the OS resolver. When a hostname cannot
        // be mapped to an IP address, java.net.URL / HttpURLConnection throws UnknownHostException.
        // Specifying a valid domain and setting connection/read timeouts ensures network requests execute reliably.
        URL url = new URL("https://httpbin.org/status/200");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setConnectTimeout(5000);
        conn.setReadTimeout(5000);

        int responseCode = conn.getResponseCode();
        System.out.println("HTTP Response Code: " + responseCode);

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        conn.disconnect();
    }
}