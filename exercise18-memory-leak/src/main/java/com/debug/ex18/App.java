package com.debug.ex18;

/**
 * Application entry point demonstrating memory-safe session cache management:
 * 1. Generates incoming user session traffic.
 * 2. Ingests sessions through SessionCacheManager (with bounded eviction policy).
 * 3. Releases resources when processing concludes.
 */
public class App {

    public static void main(String[] args) {
        SessionTrafficService trafficService = new SessionTrafficService();
        SessionCacheManager cacheManager = new SessionCacheManager();

        // Process a batch of 5 sessions within bounded capacity
        for (int i = 0; i < 5; i++) {
            UserSession session = trafficService.createSession(i);
            cacheManager.cacheSession(session);
        }

        System.out.println("Active sessions cached: " + cacheManager.getCachedSessionCount());
        cacheManager.clear();
    }
}