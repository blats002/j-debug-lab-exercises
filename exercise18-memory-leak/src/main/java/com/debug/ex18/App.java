package com.debug.ex18;

public class App {
    public static void main(String[] args) {
        SessionTrafficService trafficService = new SessionTrafficService();
        SessionCacheManager cacheManager = new SessionCacheManager();

        for (int i = 0; i < 100000; i++) {
            UserSession session = trafficService.createSession(i);
            cacheManager.cacheSession(session);
        }

        System.out.println("Active sessions cached: " + cacheManager.getCachedSessionCount());
    }
}