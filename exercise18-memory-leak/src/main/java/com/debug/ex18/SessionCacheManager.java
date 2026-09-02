package com.debug.ex18;

import java.util.ArrayList;
import java.util.List;

public class SessionCacheManager {
    private final List<UserSession> activeSessions = new ArrayList<>();

    public void cacheSession(UserSession session) {
        activeSessions.add(session);
    }

    public int getCachedSessionCount() {
        return activeSessions.size();
    }

    public void clear() {
        activeSessions.clear();
    }
}
